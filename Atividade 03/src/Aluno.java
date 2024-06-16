public class Aluno {
    private int numeroDeMatricula;
    private String nomeDoAluno;
    private double primeiraNota;
    private double segundaNota;

    public Aluno(int numeroDeMatricula, String nomeDoAluno, double primeiraNota, double segundaNota) {
        this.numeroDeMatricula = numeroDeMatricula;
        this.nomeDoAluno = nomeDoAluno;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    public double mediaDasNotas(double primeiraNota, double segundaNota) {
        return (primeiraNota + segundaNota) / 2;
    }

    public void alunoFoiAprovado() {
        if(mediaDasNotas(primeiraNota, segundaNota) >= 7) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
            System.out.println("São necessários " + quantoPrecisa(mediaDasNotas(primeiraNota, segundaNota)) + " para passar");
        }
    }

    public double quantoPrecisa(double mediaDasNotas) {
        return (50 - mediaDasNotas * 6) / 4;
    }
}
