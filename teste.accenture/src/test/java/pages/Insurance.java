package pages;

import elementos.Elementos;

public class Insurance {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	
	public void dadosVeiculo( String make, String model, String cylinder, String engine, String manufacture, String numberSeats, String numberSea, String fuel, String payload, String weight, String price, String mileage ) {
		metodos.digitar(el.getElementoMake(), make);
		metodos.digitar(el.getElementoModel(), model);
		metodos.digitar(el.getElementoCylinder(), cylinder);
		metodos.digitar(el.getEnginePerformance(), engine);
		metodos.digitar(el.getDateofManufacture(), manufacture);
		metodos.digitar(el.getNumberofSeats(), numberSeats);
		metodos.digitar(el.getNumberofSea(), numberSea);
		metodos.digitar(el.getFuelType(), fuel);
		metodos.digitar(el.getPayLoad(), payload);
		metodos.digitar(el.getTotalWeight(), weight);
		metodos.digitar(el.getListPrice(), price);		
		metodos.digitar(el.getAnnualMileage(), mileage);
		metodos.screenShot("dados do veiculo");
		metodos.clicar(el.getBtnEnviar());
		
	}
	public void dadosSeguro(String first, String name, String birth, String country, String zipCode, String occupation) {
		metodos.digitar(el.getFirstName(), first);
		metodos.digitar(el.getLastName(), name);
		metodos.digitar(el.getDateofBirth(), birth);
		metodos.digitar(el.getCountry(), country);
		metodos.digitar(el.getZipCode(), zipCode);
		metodos.digitar(el.getOccupation(), occupation);
		metodos.clicar(el.getHobbies());
		metodos.screenShot("dados do seguro");
		metodos.clicar(el.getBtnNext());
	}
	
	public void dadosProduto(String startDate, String somaSeguro, String meritRating, String damageInsurance, String CourtesyCar) {
		metodos.digitar(el.getStartDate(), startDate);
		metodos.digitar(el.getInsuranceSum(), somaSeguro);
		metodos.digitar(el.getMeritRating(), meritRating);
		metodos.digitar(el.getDamageInsurance(), damageInsurance);
		metodos.clicar(el.getOptionalProducts());
		metodos.digitar(el.getCourtesyCar(), CourtesyCar);
		metodos.screenShot("dados do produto");
		metodos.clicar(el.getBtnProdutc());
	}
	
	public void dadosPreco() {
		metodos.clicar(el.getPrice());
		metodos.screenShot("dados do Preço");
		metodos.clicar(el.getBtnPrice());
	}
	
    public void enviarCotacao(String email, String userName, String Password, String confirmPassword, String Comments) {
    	metodos.digitar(el.getEmail(), email);
    	metodos.digitar(el.getUserName(), userName);
    	metodos.digitar(el.getPassword(), Password);
    	metodos.digitar(el.getConfirmPassword(), confirmPassword);
    	metodos.digitar(el.getComments(), Comments);
    	metodos.screenShot("Enviar cotação");
    	metodos.clicar(el.getSend());    	
    	metodos.pausa(10000);
    	
    }
    
    public void validarEnvio() {
    	
    	metodos.screenShot("Mensagem enviada com sucesso");
    	metodos.validarTexto(el.getSendEmail(), "Sending email success!" );
    	
    }
    
   }



