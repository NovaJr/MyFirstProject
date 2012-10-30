package module.zero.am.ctec;

public class Money extends Favorite {
	private String value;

	private String color;
	private String country;
	private String type;

	public Money()

	{
		value = "buy objects";
		color = "green";
		country = "united states";
		type = "US currency";
	}

	public Money(String moneyValue, String moneyGreen,
			String countryUnitedstates, String typeUnitedState)

	{
		value = moneyValue;
		color = moneyGreen;
		country = countryUnitedstates;
		type = typeUnitedState;
	}

	public String getValue()
	{
		return value;
	}

	public String getColor()
	{
		return color;
	}

	public String getcountry()
	{
		return country;
	}

	public String gettype()
	{
		return type;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	private void printInfo()

	{
		System.out.println("hello my name is Justin I like money");
		System.out.println("the best part about money is being able to "
				+ value);
		System.out.println("The color of money is " + color);
		System.out.println("the country is " + country);
		System.out.println("the type of money I use " + type);
	}

	public void start()
	{
		// type value color country
		Money mikeMoney = new Money("computer money", "Green", "US", " USA");
		Money lopezMoney = new Money("buy nintendo things", "Green", "US", " USA");
		mikeMoney.printInfo();
		lopezMoney.printInfo();
	}
}