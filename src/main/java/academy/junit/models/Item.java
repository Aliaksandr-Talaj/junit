package academy.junit.models;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.jgroups.annotations.XmlAttribute;

import fathom.rest.controller.Required;
import fathom.rest.swagger.ApiModel;
import fathom.rest.swagger.ApiProperty;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@ApiModel(name = "Item", description = "a simple item object")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlAttribute
    @ApiProperty
    @Required
    public int id;

    @ApiProperty
    @NotNull
    public String name;

    private Item() {
        // JAXB constructor
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}