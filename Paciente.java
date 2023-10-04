import java.sql.Date;

public class Paciente {
private int idPaciente;
private String nomePaciente;
private String sobrenome;
private String email;
private String telefone;
private Date dataNascimento;
private String CPF;
private String estado;

    public Paciente(int idPaciente, String nomePaciente, String sobrenome, String email, String telefone, String CPF, String estado, Date dataNascimento) {
        this.idPaciente = idPaciente;
        this.nomePaciente = nomePaciente;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.estado = estado;
        
    }
    }
