package fr.wowcompanion.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.wowcompanion.openapi.model.FactionDTO;
import fr.wowcompanion.openapi.model.RealmDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Guild index DTO
 */

@Schema(name = "GuildIndexDTO", description = "Guild index DTO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuildIndexDTO   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("realmDTO")
  private RealmDTO realmDTO;

  @JsonProperty("factionDTO")
  private FactionDTO factionDTO;

  @JsonProperty("useApplication")
  private Boolean useApplication;

  public GuildIndexDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GuildIndexDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GuildIndexDTO realmDTO(RealmDTO realmDTO) {
    this.realmDTO = realmDTO;
    return this;
  }

  /**
   * Get realmDTO
   * @return realmDTO
  */
  @NotNull @Valid 
  @Schema(name = "realmDTO", required = true)
  public RealmDTO getRealmDTO() {
    return realmDTO;
  }

  public void setRealmDTO(RealmDTO realmDTO) {
    this.realmDTO = realmDTO;
  }

  public GuildIndexDTO factionDTO(FactionDTO factionDTO) {
    this.factionDTO = factionDTO;
    return this;
  }

  /**
   * Get factionDTO
   * @return factionDTO
  */
  @NotNull @Valid 
  @Schema(name = "factionDTO", required = true)
  public FactionDTO getFactionDTO() {
    return factionDTO;
  }

  public void setFactionDTO(FactionDTO factionDTO) {
    this.factionDTO = factionDTO;
  }

  public GuildIndexDTO useApplication(Boolean useApplication) {
    this.useApplication = useApplication;
    return this;
  }

  /**
   * Get useApplication
   * @return useApplication
  */
  @NotNull 
  @Schema(name = "useApplication", required = true)
  public Boolean getUseApplication() {
    return useApplication;
  }

  public void setUseApplication(Boolean useApplication) {
    this.useApplication = useApplication;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuildIndexDTO guildIndexDTO = (GuildIndexDTO) o;
    return Objects.equals(this.id, guildIndexDTO.id) &&
        Objects.equals(this.name, guildIndexDTO.name) &&
        Objects.equals(this.realmDTO, guildIndexDTO.realmDTO) &&
        Objects.equals(this.factionDTO, guildIndexDTO.factionDTO) &&
        Objects.equals(this.useApplication, guildIndexDTO.useApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, realmDTO, factionDTO, useApplication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuildIndexDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    realmDTO: ").append(toIndentedString(realmDTO)).append("\n");
    sb.append("    factionDTO: ").append(toIndentedString(factionDTO)).append("\n");
    sb.append("    useApplication: ").append(toIndentedString(useApplication)).append("\n");
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

