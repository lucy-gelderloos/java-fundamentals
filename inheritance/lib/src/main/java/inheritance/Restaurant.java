package inheritance;

import java.util.ArrayList;

public class Restaurant extends Business {

    private String chainName;

    public Restaurant(String name, String priceCategory, String chainName, String businessType) {
        super(name, priceCategory, businessType);
        // for now, if restaurant isn't part of a chain, set chainName to empty string
        this.chainName = chainName;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }
}
