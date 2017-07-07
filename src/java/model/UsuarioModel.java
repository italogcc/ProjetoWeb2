package model;

public class UsuarioModel {
    private String matricula;
    private String nome;
    private String sobrenome;
    private String idpessoal01;
    private String idpessoal02;
    private String sexo;
    private String datanasc;
    private String filpai;
    private String filmae;
    private String telefone01;
    private String telefone02;
    private String logradouro;
    private String lognumero;
    private String logcomplemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String planosaude01;
    private String numplanosaude01;
    private String planosaude02;			
    private String numplanosaude02;
        
    public UsuarioModel(String matricula,
                    String nome,
                    String sobrenome,
                    String idpessoal01,
                    String idpessoal02,
                    String sexo,
                    String datanasc,
                    String filpai,              
                    String filmae,
                    String telefone01,
                    String telefone02,
                    String logradouro,
                    String lognumero,
                    String logcomplemento,
                    String bairro,
                    String cidade,
                    String estado,
                    String planosaude01,
                    String numplanosaude01,
                    String planosaude02,
                    String numplanosaude02) {
    
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idpessoal01 = idpessoal01;
        this.idpessoal02 = idpessoal02;
        this.sexo = sexo;
        this.datanasc = datanasc;
        this.filpai = filpai;
        this.filmae = filmae;
        this.telefone01 = telefone01;
        this.telefone02 = telefone02;
        this.logradouro = logradouro;
        this.lognumero = lognumero;
        this.logcomplemento = logcomplemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.planosaude01 = planosaude01;
        this.numplanosaude01 = numplanosaude01;
        this.planosaude02 = planosaude02;			
        this.numplanosaude02 = numplanosaude02;			
    }
   
    public UsuarioModel() {
    }

    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getIdPessoal01() {
        return idpessoal01;
    }
    
    public void setIdPessoal01(String idpessoal01) {
        this.idpessoal01 = idpessoal01;
    }    
        
    public String getIdPessoal02() {
        return idpessoal02;
    }
    
    public void setIdPessoal02(String idpessoal02) {
        this.idpessoal02 = idpessoal02;
    }
    
    public String getSexo() {
        return sexo;
    }
                    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDatanasc() {
        return datanasc;
    }
                    
    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getFilpai() {
        return filpai;
    }
                    
    public void setFilpai(String filpai) {
        this.filpai = filpai;
    }
    
    public String getFilmae() {
        return filmae;
    }
                    
    public void setFilmae(String filmae) {
        this.filmae = filmae;
    }
    
    public String getTelefone01() {
        return telefone01;
    }
                    
    public void setTelefone01(String telefone01) {
        this.telefone01 = telefone01;
    }
    
    public String getTelefone02() {
        return telefone02;
    }
                 
    public void setTelefone02(String telefone02) {
        this.telefone02 = telefone02;
    }
    
    public String getLogradouro() {
        return logradouro;
    }
                    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public String getLognumero() {
        return lognumero;
    }
                    
    public void setLognumero(String lognumero) {
        this.lognumero = lognumero;
    }
    
    public String getLogcomplemento() {
        return logcomplemento;
    }
                    
    public void setLogcomplemento(String logcomplemento) {
        this.logcomplemento = logcomplemento;
    }
    
    public String getBairro() {
        return bairro;
    }
                    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getCidade() {
        return cidade;
    }
                    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEstado() {
        return estado;
    }
                    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getPlanosaude01() {
        return planosaude01;
    }
    
    public void setPlanosaude01(String planosaude01) {
        this.planosaude01 = planosaude01;
    }
    
    public String getNumplanosaude01() {
        return numplanosaude01;
    }			
                    
    public void setNumplanosaude01(String numplanosaude01) {
        this.numplanosaude01 = numplanosaude01;
    }			
                    
    public void setPlanosaude02(String planosaude02) {
        this.planosaude02 = planosaude02;
    }
    
    public String getNumplanosaude02() {
        return numplanosaude02;
    }			
                    
    public void setNumplanosaude02(String numplanosaude02) {
        this.numplanosaude02 = numplanosaude02;
    }
}

    /*
    Atencão: Rever todas os TIPOS de variáveis!
    
    private String nome;
    private String sobrenome;
    private int idpessoal01;
    private int datanasc;
    private char sexo;
    private int telefone01;
    private int telefone02;
    private String logradouro;
    private int lognumero;
    private String logcomplemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String planosaude01;
    private String planosaude02;			
    private int matricula;
    
    public UsuarioModel(String nome,
                    String sobrenome,
                    int idpessoal01,
                    int datanasc,
                    char sexo,
                    int telefone01,
                    int telefone02,
                    String logradouro,
                    int lognumero,
                    String logcomplemento,
                    String bairro,
                    String cidade,
                    String estado,
                    String planosaude01,
                    String planosaude02,			
                    int matricula) {
    
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idpessoal01 = idpessoal01;
        this.datanasc = datanasc;
        this.sexo = sexo;
        this.telefone01 = telefone01;
        this.telefone02 = telefone02;
        this.logradouro = logradouro;
        this.lognumero = lognumero;
        this.logcomplemento = logcomplemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.planosaude01 = planosaude01;
        this.planosaude02 = planosaude02;			
        this.matricula = matricula;
    }
   
    public UsuarioModel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public int getIdPessoal01() {
        return idpessoal01;
    }
    
    public void setIdPessoal01(int idpessoal01) {
        this.idpessoal01 = idpessoal01;
    }    
        
    public int getDatanasc() {
        return datanasc;
    }
                    
    public void setDatanasc(int datanasc) {
        this.datanasc = datanasc;
    }
    
    public char getSexo() {
        return sexo;
    }
                    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public int getTelefone01() {
        return telefone01;
    }
                    
    public void setTelefone01(int telefone01) {
        this.telefone01 = telefone01;
    }
    
    public int getTelefone02() {
        return telefone02;
    }
                 
    public void setTelefone02(int telefone02) {
        this.telefone02 = telefone02;
    }
    
    public String getLogradouro() {
        return logradouro;
    }
                    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public int getLognumero() {
        return lognumero;
    }
                    
    public void setLognumero(int lognumero) {
        this.lognumero = lognumero;
    }
    
    public String getLogcomplemento() {
        return logcomplemento;
    }
                    
    public void setLogcomplemento(String logcomplemento) {
        this.logcomplemento = logcomplemento;
    }
    
    public String getBairro() {
        return bairro;
    }
                    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getCidade() {
        return cidade;
    }
                    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEstado() {
        return estado;
    }
                    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getPlanosaude01() {
        return planosaude01;
    }
                    
    public void setPlanosaude01(String planosaude01) {
        this.planosaude01 = planosaude01;
    }
    
    public String getPlanosaude02() {
        return planosaude02;
    }			
                    
    public void setPlanosaude02(String planosaude02) {
        this.planosaude02 = planosaude02;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }   

}
*/