package hello;

import java.util.concurrent.atomic.AtomicLong;

public class Product {
    private AtomicLong productID = new AtomicLong();
    private String productDesc;
    private String imageURL;

    public void setProductID(AtomicLong productID) {
        this.productID = productID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Product(AtomicLong productID, String productDesc, String imageURL){
        this.productID = productID;
        this.productDesc = productDesc;
        this. imageURL = imageURL;
    }

    public AtomicLong getProductID() {
        return productID;
    }
}
