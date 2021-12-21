package models;

public class Voo {

	private Aviao aeronave;
    private int nro;
    private String data;
    private String hora;

    public Voo(Aviao aeronave, int nro, String data, String hora) {
        this.aeronave = aeronave;
        this.nro = nro;
        this.data = data;
        this.hora = hora;
    }    

    public Voo() {
        
    }

     
    public int getNro() {
        return nro;
    }

 
    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

	public void setData(String data2) {
		this.data = data2;
		
	}

	public void setHora(String hora2) {
		this.hora = hora2;
		
	}

	public void setAeronave(Aviao aeronave2) {
		this.aeronave = aeronave2;
		
	}

	public void setNro(int nro2) {
		this.nro = nro2;
		
	}
}
