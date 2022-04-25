public class ControleDeBonificacao {
     private double totalDebonus;

    public double getTotalDebonus() {
        return totalDebonus;
    }
    public double calculaTotalDeBonus(Funcionario f) {
		return this.totalDebonus = this.totalDebonus + f.controle();
}
