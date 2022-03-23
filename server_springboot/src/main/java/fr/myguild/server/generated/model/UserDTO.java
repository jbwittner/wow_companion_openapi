package fr.myguild.server.generated.model;

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
 * UserDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UserDTO   {

  @JsonProperty("userName")
  private String userName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("battletag")
  private String battletag;

  @JsonProperty("blizzardId")
  private Integer blizzardId;

  @JsonProperty("isAdmin")
  private Boolean isAdmin;

  public UserDTO userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  @NotNull 
  @Schema(name = "userName", required = true)
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull @javax.validation.constraints.Email
  @Schema(name = "email", required = true)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDTO battletag(String battletag) {
    this.battletag = battletag;
    return this;
  }

  /**
   * Get battletag
   * @return battletag
  */
  @NotNull 
  @Schema(name = "battletag", required = true)
  public String getBattletag() {
    return battletag;
  }

  public void setBattletag(String battletag) {
    this.battletag = battletag;
  }

  public UserDTO blizzardId(Integer blizzardId) {
    this.blizzardId = blizzardId;
    return this;
  }

  /**
   * Get blizzardId
   * @return blizzardId
  */
  @NotNull 
  @Schema(name = "blizzardId", required = true)
  public Integer getBlizzardId() {
    return blizzardId;
  }

  public void setBlizzardId(Integer blizzardId) {
    this.blizzardId = blizzardId;
  }

  public UserDTO isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Get isAdmin
   * @return isAdmin
  */
  @NotNull 
  @Schema(name = "isAdmin", required = true)
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDTO userDTO = (UserDTO) o;
    return Objects.equals(this.userName, userDTO.userName) &&
        Objects.equals(this.email, userDTO.email) &&
        Objects.equals(this.battletag, userDTO.battletag) &&
        Objects.equals(this.blizzardId, userDTO.blizzardId) &&
        Objects.equals(this.isAdmin, userDTO.isAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, email, battletag, blizzardId, isAdmin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    battletag: ").append(toIndentedString(battletag)).append("\n");
    sb.append("    blizzardId: ").append(toIndentedString(blizzardId)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
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

