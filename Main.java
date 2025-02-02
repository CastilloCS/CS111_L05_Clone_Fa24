// PARTNER NAME:
// PARTNER NAME:
// CS111 SECTION #:
// DATE: 

public class Main
{
	public static void main(String[] args)
	{
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
		final String ASCII_ART_0 ="    .----.    .----.     ",
					ASCII_ART_1 = "   (  --  \\  /  --  )    ",
					ASCII_ART_2 = "          |  |           ",
					ASCII_ART_3 = "         _/  \\_          ",
					ASCII_ART_4 = "        (_    _)         ",
					ASCII_ART_5 = "     ,    `--`    ,      ",
					ASCII_ART_6 = "     \\'-.______.-'/      ",
					ASCII_ART_7 = "      \\          /       ",
					ASCII_ART_8 = "       '.--..--.'        ",
					ASCII_ART_9 = "         `\"\"\"\"\"`         ",
					ASCII_CREDIT =" ascii art by: jgs    ";

		final String TITLE_USA = "UNITED STATES OF AMERICA",
				TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
		final String LABEL_SURNAME = "Surname", LABEL_GIVEN_NAME = "Given Name", LABEL_USCIS_NUM = "USCIS#",
				LABEL_CATEGORY = "Category", LABEL_CARD_NUM = "Card#", LABEL_BIRTH_COUNTRY = "Country of Birth",
				LABEL_TERMS_CONDITIONS = "Terms and Conditions", LABEL_BIRTH_DATE = "Date of Birth",
				LABEL_SEX = "Sex", LABEL_VALID_DATE = "Valid From:", LABEL_EXPIRE_DATE = "Card Expires:",
				LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";
		
		//DECLARATION SECTION
		//complete fields
		String surname, givenName, category, cardNum, birthCountry, termsAndConditions;
		char sex;
		
		//parts of fields
		String birthMonth;
		int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear,
			validDay, validMonth, validYear, expireMonth, expireDay, expireYear;
			
		//extra vars to reduce messy print statements
		String uscisNum, dateOfBirth, validDate, expireDate;
	
		//INITIALIZATION SECTION
		//data from EAC database
		surname = "CHAPETON-LAMAS";
		givenName = "NERY";
		category = "C09";
		cardNum = "SRC9876543210";
		birthCountry = "Guatemala";
		termsAndConditions = "None";
		sex = 'M';
		
		birthMonth = "JAN";
		uscisNum1 = 12;
		uscisNum2 = 4;
		uscisNum3 = 789;
		birthDay = 1;
		birthYear = 1970;
		validDay = 2;
		validMonth = 2;
		validYear = 2020;
		expireMonth = 2;
		expireDay = 2;
		expireYear = 2022;
		
		//additional variables to help cleanup long print's below
		uscisNum = uscisNum1 + "-" + uscisNum2 + "-" + uscisNum3;
		dateOfBirth = birthDay + " " + birthMonth + " " + birthYear;
		validDate = validMonth + "/" + validDay + "/" + validYear;
		expireDate = expireMonth + "/" + expireDay + "/" + expireYear;
		
		//INPUT + CALCULATION SECTION
		//N/A
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
		System.out.println("║           " + TITLE_USA + "                                   ║");
		System.out.println("║                               " + TITLE_EAC + "          ║");
		
		System.out.println("║                         " + LABEL_SURNAME + "║");
		System.out.println("║                         " + surname + "║");
		System.out.println("║" + ASCII_ART_0 + LABEL_GIVEN_NAME + "║");
		System.out.println("║" + ASCII_ART_1 + givenName + "║");
		System.out.println("║" + ASCII_ART_2 + LABEL_USCIS_NUM + LABEL_CATEGORY + LABEL_CARD_NUM + "║");
		System.out.println("║" + ASCII_ART_3 + uscisNum + category + cardNum + "║");
		
		System.out.println("║" + ASCII_ART_4 + LABEL_BIRTH_COUNTRY + "║");
		System.out.println("║" + ASCII_ART_5 + birthCountry + "║");
		System.out.println("║" + ASCII_ART_6 + LABEL_TERMS_CONDITIONS + "║");
		System.out.println("║" + ASCII_ART_7 + termsAndConditions + "║");
		
		System.out.println("║" + ASCII_ART_8 + LABEL_BIRTH_DATE + LABEL_SEX + "║");
		System.out.println("║" + ASCII_ART_9 + dateOfBirth + sex + "║");
		
		System.out.println("║                         " + LABEL_VALID_DATE + validDate + "║");
		System.out.println("║                         " + LABEL_EXPIRE_DATE + expireDate + "║");
		
		System.out.println("║" + ASCII_CREDIT + LABEL_REENTRY_DISCLAIMER + "║");
		System.out.println("╚══════════════════════════════════════════════════════════════════════╝");
		
	}
}