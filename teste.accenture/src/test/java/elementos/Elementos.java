package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By elementoMake = By.id("make");
	private By elementoModel = By.id("model");
	private By elementoCylinder = By.id("cylindercapacity");
	private By enginePerformance = By.id("engineperformance");
	private By dateofManufacture = By.id("dateofmanufacture");
	private By numberofSeats = By.id("numberofseats");
	private By numberofSea = By.name("Number of Seats Motorcycle");
	private By fuelType = By.id("fuel");
	private By payLoad = By.id("payload");
	private By totalWeight = By.id("totalweight");
	private By listPrice = By.id("listprice");	
	private By annualMileage = By.id("annualmileage");
	private By btnEnviar = By.id("nextenterinsurantdata");
	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By dateofBirth = By.id("birthdate");
	private By country = By.id("country");
	private By zipCode = By.id("zipcode");
	private By city = By.id("city");
	private By occupation = By.id("occupation");
	private By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]");
	private By btnNext = By.id("nextenterproductdata");
	private By startDate = By.name("Start Date");
	private By insuranceSum = By.id("insurancesum");
	private By meritRating = By.id("meritrating");
	private By damageInsurance = By.id("damageinsurance");
	private By optionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]");
	private By courtesyCar = By.id("courtesycar");
	private By btnProdutc = By.id("nextselectpriceoption");
	private By price = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]");
	private By btnPrice = By.cssSelector("#nextsendquote");
	private By email = By.id("email");
	private By userName = By.id("username");
	private By password = By.id("password");
	private By confirmPassword = By.id("confirmpassword");
	private By comments = By.id("Comments");
	private By send = By.id("sendemail");
	private By sendEmail = By.xpath("//*[contains(text(), 'Sending e-mail success!')]");
	public By getElementoMake() {
		return elementoMake;
	}
	public By getElementoModel() {
		return elementoModel;
	}
	public By getElementoCylinder() {
		return elementoCylinder;
	}
	public By getEnginePerformance() {
		return enginePerformance;
	}
	public By getDateofManufacture() {
		return dateofManufacture;
	}
	public By getNumberofSeats() {
		return numberofSeats;
	}
	public By getNumberofSea() {
		return numberofSea;
	}
	public By getFuelType() {
		return fuelType;
	}
	public By getPayLoad() {
		return payLoad;
	}
	public By getTotalWeight() {
		return totalWeight;
	}
	public By getListPrice() {
		return listPrice;
	}
	public By getAnnualMileage() {
		return annualMileage;
	}
	public By getBtnEnviar() {
		return btnEnviar;
	}
	public By getFirstName() {
		return firstName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getDateofBirth() {
		return dateofBirth;
	}
	public By getCountry() {
		return country;
	}
	public By getZipCode() {
		return zipCode;
	}
	public By getCity() {
		return city;
	}
	public By getOccupation() {
		return occupation;
	}
	public By getHobbies() {
		return hobbies;
	}
	public By getBtnNext() {
		return btnNext;
	}
	public By getStartDate() {
		return startDate;
	}
	public By getInsuranceSum() {
		return insuranceSum;
	}
	public By getMeritRating() {
		return meritRating;
	}
	public By getDamageInsurance() {
		return damageInsurance;
	}
	public By getOptionalProducts() {
		return optionalProducts;
	}
	public By getCourtesyCar() {
		return courtesyCar;
	}
	public By getBtnProdutc() {
		return btnProdutc;
	}
	public By getPrice() {
		return price;
	}
	public By getBtnPrice() {
		return btnPrice;
	}
	public By getEmail() {
		return email;
	}
	public By getUserName() {
		return userName;
	}
	public By getPassword() {
		return password;
	}
	public By getConfirmPassword() {
		return confirmPassword;
	}
	public By getComments() {
		return comments;
	}
	public By getSend() {
		return send;
	}
	public By getSendEmail() {
		return sendEmail;
	}
	
	
}