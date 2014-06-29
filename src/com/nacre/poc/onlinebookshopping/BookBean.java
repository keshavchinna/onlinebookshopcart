/**
 * 
 */

package com.nacre.poc.onlinebookshopping;
import java.io.Serializable;


/**
 * @author keshav
 *
 */
public class BookBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ISBN, title, copyright, imageFile;
	private int editionNumber, publisherID;
	private double price;
	private String fmprice;
	/**
	 * @return the fmprice
	 */
	public String getFmprice() {
		return fmprice;
	}
	/**
	 * @param fmprice the fmprice to set
	 */
	public void setFmprice(String fmprice) {
		this.fmprice = fmprice;
	}
	public BookBean(String ISBN,String title,String copyright,int editionNumber,int publisherID,double price,String imageFile) {
		   this.ISBN=ISBN;
		   this.title=title;
		   this.copyright=copyright;
		   this.editionNumber=editionNumber;
		   this.publisherID=publisherID;
		   this.price=price;
		   this.imageFile=imageFile;
	   }
	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the copyright
	 */
	public String getCopyright() {
		return copyright;
	}
	/**
	 * @param copyright the copyright to set
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	/**
	 * @return the imageFile
	 */
	public String getImageFile() {
		return imageFile;
	}
	/**
	 * @param imageFile the imageFile to set
	 */
	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	/**
	 * @return the editionNumber
	 */
	public int getEditionNumber() {
		return editionNumber;
	}
	/**
	 * @param editionNumber the editionNumber to set
	 */
	public void setEditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}
	/**
	 * @return the publisherID
	 */
	public int getPublisherID() {
		return publisherID;
	}
	/**
	 * @param publisherID the publisherID to set
	 */
	public void setPublisherID(int publisherID) {
		this.publisherID = publisherID;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	   
}
