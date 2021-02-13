package convert;


public class Convert {
   public static String  longToShort(final String input) {
	   String output = null;
	   
	   switch(input) {
	   case "United States Dollar":
		   output = "USD";
		   break;
		   
	   case "Euro" :
		   output = "EUR";
		   break;
		   
	   case "Japnese Yen":
		   output = "JPY";
		   break;
		   
	   case "Pound Sterling":
		   output = "GBP";
		   break;
		   
	   case "Australian Dollar":
		   output = "AUD";
		   break;
		   
	   case "Canadian Dolllar":
		   output = "CAD";
		   break;
		   
	   case "Swiss Franc":
		   output = "CHF";
		   break;
		   
	   case "Chinese Renminbi":
		   output = "CNY";
		   break;
		   
	   case "Hong Kong Dollar":
		   output = "HKD";
		   break;
		   
	   case "New Zeland Dollar":
		   output = "NZD";
		   break;
	   }
	   
	   
	   return output;
   }
   
   public static String convert(final String key, final String inpc, final String inpa, final String outc) {
	   String converted = null;
	   String inputCurrency = longToShort(inpc);
	   String outputCurrency = longToShort(outc);
	   //https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP/AMOUNT
	   String link = "https://v6.exchangerate-api.com/v6/"+ key + "/pair/"+inputCurrency+"/"+outputCurrency+"/"+inpa;
	   //System.out.println(link);

	return converted;
	   
	   
}}
