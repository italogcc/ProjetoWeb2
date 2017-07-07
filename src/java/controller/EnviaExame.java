/*
Servlet para envio dos exames
*/
package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

public class EnviaExame extends HttpServlet {
/*
Atencão: Rever e testar forma de localizar os arquivos!
*/
    private String insereDir(FileItem item) throws IOException {
        String caminho = getServletContext().getRealPath("/exame") + "/";

        File diretorio = new File(caminho);
        if (!diretorio.exists()) {
            diretorio.mkdir();
        }

        String nome = item.getNome();
        for (int i = 0; i < arq.length; i++) {
            nome = arq[i];
        }

        File file = new File(diretorio, nome);
        FileOutputStream output = new FileOutputStream(file);
        InputStream is = item.getInputStream();
        byte[] buffer = new byte[6144];
        int Verifs;
        while ((Verifs = is.read(buffer)) >= 0) {
            output.write(buffer, 0, Verifs);
        }

        output.flush();
        output.close();

        return caminho;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        boolean isMultiPart = FileUpload.isMultipartContent(new ServletRequestContext(req));
        String caminho = "";
        if (isMultiPart) {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            try {
                List items = upload.parseRequest(req);
                Iterator iter = items.iterator();
                while (iter.hasNext()) {
                    FileItem item = (FileItem) iter.next();
                    if (!item.isFormField()) {
                        if (item.getName().length() > 0) {
                            caminho = this.insereDir(item);
                        }
                    }
                }
            } catch (FileUploadException ex) {
            } catch (Exception ex) {
            }
        }
        req.setAttribute("caminho", caminho);
        req.getRequestDispatcher("WEB-INF/view/recebimento.jsp").forward(req, resp);
        
        
    }
}
