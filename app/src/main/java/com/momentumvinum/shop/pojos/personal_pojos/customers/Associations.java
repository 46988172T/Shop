
package com.momentumvinum.shop.pojos.personal_pojos.customers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Associations {

    private List<Group> groups = new ArrayList<Group>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Associations() {
    }

    /**
     * 
     * @param groups
     */
    public Associations(List<Group> groups) {
        this.groups = groups;
    }

    /**
     * 
     * @return
     *     The groups
     */
    public List<Group> getGroups() {
        return groups;
    }

    /**
     * 
     * @param groups
     *     The groups
     */
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

}
