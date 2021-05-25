/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Customer;
import io.swagger.client.model.Links;
import io.swagger.client.model.Registration;
import java.io.IOException;

/**
 * EntityModelCar
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T14:15:56.866+01:00")
public class EntityModelCar {
  @SerializedName("car")
  private Registration car = null;

  @SerializedName("carid")
  private Integer carid = null;

  @SerializedName("customerid")
  private Customer customerid = null;

  @SerializedName("links")
  private Links links = null;

  @SerializedName("make")
  private String make = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("regplate")
  private String regplate = null;

  public EntityModelCar car(Registration car) {
    this.car = car;
    return this;
  }

   /**
   * Get car
   * @return car
  **/
  @ApiModelProperty(value = "")
  public Registration getCar() {
    return car;
  }

  public void setCar(Registration car) {
    this.car = car;
  }

  public EntityModelCar carid(Integer carid) {
    this.carid = carid;
    return this;
  }

   /**
   * Get carid
   * @return carid
  **/
  @ApiModelProperty(value = "")
  public Integer getCarid() {
    return carid;
  }

  public void setCarid(Integer carid) {
    this.carid = carid;
  }

  public EntityModelCar customerid(Customer customerid) {
    this.customerid = customerid;
    return this;
  }

   /**
   * Get customerid
   * @return customerid
  **/
  @ApiModelProperty(value = "")
  public Customer getCustomerid() {
    return customerid;
  }

  public void setCustomerid(Customer customerid) {
    this.customerid = customerid;
  }

  public EntityModelCar links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public EntityModelCar make(String make) {
    this.make = make;
    return this;
  }

   /**
   * Get make
   * @return make
  **/
  @ApiModelProperty(value = "")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public EntityModelCar model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public EntityModelCar regplate(String regplate) {
    this.regplate = regplate;
    return this;
  }

   /**
   * Get regplate
   * @return regplate
  **/
  @ApiModelProperty(value = "")
  public String getRegplate() {
    return regplate;
  }

  public void setRegplate(String regplate) {
    this.regplate = regplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityModelCar entityModelCar = (EntityModelCar) o;
    return Objects.equals(this.car, entityModelCar.car) &&
        Objects.equals(this.carid, entityModelCar.carid) &&
        Objects.equals(this.customerid, entityModelCar.customerid) &&
        Objects.equals(this.links, entityModelCar.links) &&
        Objects.equals(this.make, entityModelCar.make) &&
        Objects.equals(this.model, entityModelCar.model) &&
        Objects.equals(this.regplate, entityModelCar.regplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(car, carid, customerid, links, make, model, regplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityModelCar {\n");
    
    sb.append("    car: ").append(toIndentedString(car)).append("\n");
    sb.append("    carid: ").append(toIndentedString(carid)).append("\n");
    sb.append("    customerid: ").append(toIndentedString(customerid)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    regplate: ").append(toIndentedString(regplate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

