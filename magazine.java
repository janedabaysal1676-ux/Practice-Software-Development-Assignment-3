package project_1;


public class magazine extends Libraryitem {
	private int issueNumber;
	private String month;
	
	public magazine(String title, String publisher, int year, int issueNumber, String month) {
		  super(title,publisher, year );
		  this.issueNumber = issueNumber;
		  this.month = month;
	  }


	  @Override
	  
	  public void displayDetails() {

		  System.out.println ("Magazine");
		  System.out.println ("Title:" + title);
		  System.out.println ("Publisher:" + publisher);
		  System.out.println ("Year:" + year);
		  System.out.println ("IssueNumber:"  + issueNumber);
		  System.out.println ("Month:" + month);
		  System.out.println ();
	  }
	}

