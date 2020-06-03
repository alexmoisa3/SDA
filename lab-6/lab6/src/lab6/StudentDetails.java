package lab6;


public class StudentDetails {

	public String nume;
	public String prenume;
	public double[] noteLibRomana;
	public double[] noteMatematica;
	
	public StudentDetails(String nume, String prenume, double [] noteLibRomana, double [] noteMatematica)
	{
		this.nume = nume;
		this.prenume = prenume;
		this.noteLibRomana = noteLibRomana;
		this.noteMatematica = noteMatematica;
	}
}
