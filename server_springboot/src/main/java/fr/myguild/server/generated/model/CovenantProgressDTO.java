package fr.myguild.server.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.myguild.server.generated.model.CovenantDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Covenant progress DTO
 */

@Schema(name = "CovenantProgressDTO", description = "Covenant progress DTO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CovenantProgressDTO   {

  @JsonProperty("covenantDTO")
  private CovenantDTO covenantDTO;

  @JsonProperty("renown_level")
  private Integer renownLevel;

  public CovenantProgressDTO covenantDTO(CovenantDTO covenantDTO) {
    this.covenantDTO = covenantDTO;
    return this;
  }

  /**
   * Get covenantDTO
   * @return covenantDTO
  */
  @Valid 
  @Schema(name = "covenantDTO", required = false)
  public CovenantDTO getCovenantDTO() {
    return covenantDTO;
  }

  public void setCovenantDTO(CovenantDTO covenantDTO) {
    this.covenantDTO = covenantDTO;
  }

  public CovenantProgressDTO renownLevel(Integer renownLevel) {
    this.renownLevel = renownLevel;
    return this;
  }

  /**
   * Get renownLevel
   * @return renownLevel
  */
  @NotNull 
  @Schema(name = "renown_level", required = true)
  public Integer getRenownLevel() {
    return renownLevel;
  }

  public void setRenownLevel(Integer renownLevel) {
    this.renownLevel = renownLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CovenantProgressDTO covenantProgressDTO = (CovenantProgressDTO) o;
    return Objects.equals(this.covenantDTO, covenantProgressDTO.covenantDTO) &&
        Objects.equals(this.renownLevel, covenantProgressDTO.renownLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(covenantDTO, renownLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovenantProgressDTO {\n");
    sb.append("    covenantDTO: ").append(toIndentedString(covenantDTO)).append("\n");
    sb.append("    renownLevel: ").append(toIndentedString(renownLevel)).append("\n");
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

