package fr.wowcompanion.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LocalizedDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class LocalizedDTO   {

  @JsonProperty("enUS")
  private String enUS;

  @JsonProperty("esMX")
  private String esMX;

  @JsonProperty("ptBR")
  private String ptBR;

  @JsonProperty("deDE")
  private String deDE;

  @JsonProperty("enGB")
  private String enGB;

  @JsonProperty("esES")
  private String esES;

  @JsonProperty("frFR")
  private String frFR;

  @JsonProperty("itIT")
  private String itIT;

  @JsonProperty("ruRU")
  private String ruRU;

  @JsonProperty("koKR")
  private String koKR;

  @JsonProperty("zhTW")
  private String zhTW;

  @JsonProperty("zhCN")
  private String zhCN;

  public LocalizedDTO enUS(String enUS) {
    this.enUS = enUS;
    return this;
  }

  /**
   * Get enUS
   * @return enUS
  */
  @NotNull 
  @Schema(name = "enUS", required = true)
  public String getEnUS() {
    return enUS;
  }

  public void setEnUS(String enUS) {
    this.enUS = enUS;
  }

  public LocalizedDTO esMX(String esMX) {
    this.esMX = esMX;
    return this;
  }

  /**
   * Get esMX
   * @return esMX
  */
  @NotNull 
  @Schema(name = "esMX", required = true)
  public String getEsMX() {
    return esMX;
  }

  public void setEsMX(String esMX) {
    this.esMX = esMX;
  }

  public LocalizedDTO ptBR(String ptBR) {
    this.ptBR = ptBR;
    return this;
  }

  /**
   * Get ptBR
   * @return ptBR
  */
  @NotNull 
  @Schema(name = "ptBR", required = true)
  public String getPtBR() {
    return ptBR;
  }

  public void setPtBR(String ptBR) {
    this.ptBR = ptBR;
  }

  public LocalizedDTO deDE(String deDE) {
    this.deDE = deDE;
    return this;
  }

  /**
   * Get deDE
   * @return deDE
  */
  @NotNull 
  @Schema(name = "deDE", required = true)
  public String getDeDE() {
    return deDE;
  }

  public void setDeDE(String deDE) {
    this.deDE = deDE;
  }

  public LocalizedDTO enGB(String enGB) {
    this.enGB = enGB;
    return this;
  }

  /**
   * Get enGB
   * @return enGB
  */
  @NotNull 
  @Schema(name = "enGB", required = true)
  public String getEnGB() {
    return enGB;
  }

  public void setEnGB(String enGB) {
    this.enGB = enGB;
  }

  public LocalizedDTO esES(String esES) {
    this.esES = esES;
    return this;
  }

  /**
   * Get esES
   * @return esES
  */
  @NotNull 
  @Schema(name = "esES", required = true)
  public String getEsES() {
    return esES;
  }

  public void setEsES(String esES) {
    this.esES = esES;
  }

  public LocalizedDTO frFR(String frFR) {
    this.frFR = frFR;
    return this;
  }

  /**
   * Get frFR
   * @return frFR
  */
  @NotNull 
  @Schema(name = "frFR", required = true)
  public String getFrFR() {
    return frFR;
  }

  public void setFrFR(String frFR) {
    this.frFR = frFR;
  }

  public LocalizedDTO itIT(String itIT) {
    this.itIT = itIT;
    return this;
  }

  /**
   * Get itIT
   * @return itIT
  */
  @NotNull 
  @Schema(name = "itIT", required = true)
  public String getItIT() {
    return itIT;
  }

  public void setItIT(String itIT) {
    this.itIT = itIT;
  }

  public LocalizedDTO ruRU(String ruRU) {
    this.ruRU = ruRU;
    return this;
  }

  /**
   * Get ruRU
   * @return ruRU
  */
  @NotNull 
  @Schema(name = "ruRU", required = true)
  public String getRuRU() {
    return ruRU;
  }

  public void setRuRU(String ruRU) {
    this.ruRU = ruRU;
  }

  public LocalizedDTO koKR(String koKR) {
    this.koKR = koKR;
    return this;
  }

  /**
   * Get koKR
   * @return koKR
  */
  @NotNull 
  @Schema(name = "koKR", required = true)
  public String getKoKR() {
    return koKR;
  }

  public void setKoKR(String koKR) {
    this.koKR = koKR;
  }

  public LocalizedDTO zhTW(String zhTW) {
    this.zhTW = zhTW;
    return this;
  }

  /**
   * Get zhTW
   * @return zhTW
  */
  @NotNull 
  @Schema(name = "zhTW", required = true)
  public String getZhTW() {
    return zhTW;
  }

  public void setZhTW(String zhTW) {
    this.zhTW = zhTW;
  }

  public LocalizedDTO zhCN(String zhCN) {
    this.zhCN = zhCN;
    return this;
  }

  /**
   * Get zhCN
   * @return zhCN
  */
  @NotNull 
  @Schema(name = "zhCN", required = true)
  public String getZhCN() {
    return zhCN;
  }

  public void setZhCN(String zhCN) {
    this.zhCN = zhCN;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalizedDTO localizedDTO = (LocalizedDTO) o;
    return Objects.equals(this.enUS, localizedDTO.enUS) &&
        Objects.equals(this.esMX, localizedDTO.esMX) &&
        Objects.equals(this.ptBR, localizedDTO.ptBR) &&
        Objects.equals(this.deDE, localizedDTO.deDE) &&
        Objects.equals(this.enGB, localizedDTO.enGB) &&
        Objects.equals(this.esES, localizedDTO.esES) &&
        Objects.equals(this.frFR, localizedDTO.frFR) &&
        Objects.equals(this.itIT, localizedDTO.itIT) &&
        Objects.equals(this.ruRU, localizedDTO.ruRU) &&
        Objects.equals(this.koKR, localizedDTO.koKR) &&
        Objects.equals(this.zhTW, localizedDTO.zhTW) &&
        Objects.equals(this.zhCN, localizedDTO.zhCN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enUS, esMX, ptBR, deDE, enGB, esES, frFR, itIT, ruRU, koKR, zhTW, zhCN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalizedDTO {\n");
    sb.append("    enUS: ").append(toIndentedString(enUS)).append("\n");
    sb.append("    esMX: ").append(toIndentedString(esMX)).append("\n");
    sb.append("    ptBR: ").append(toIndentedString(ptBR)).append("\n");
    sb.append("    deDE: ").append(toIndentedString(deDE)).append("\n");
    sb.append("    enGB: ").append(toIndentedString(enGB)).append("\n");
    sb.append("    esES: ").append(toIndentedString(esES)).append("\n");
    sb.append("    frFR: ").append(toIndentedString(frFR)).append("\n");
    sb.append("    itIT: ").append(toIndentedString(itIT)).append("\n");
    sb.append("    ruRU: ").append(toIndentedString(ruRU)).append("\n");
    sb.append("    koKR: ").append(toIndentedString(koKR)).append("\n");
    sb.append("    zhTW: ").append(toIndentedString(zhTW)).append("\n");
    sb.append("    zhCN: ").append(toIndentedString(zhCN)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

