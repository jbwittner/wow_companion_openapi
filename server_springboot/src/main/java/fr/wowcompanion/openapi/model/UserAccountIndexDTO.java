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
 * UserAccountIndexDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UserAccountIndexDTO   {

  @JsonProperty("blizzardId")
  private Integer blizzardId;

  @JsonProperty("userName")
  private String userName;

  public UserAccountIndexDTO blizzardId(Integer blizzardId) {
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

  public UserAccountIndexDTO userName(String userName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccountIndexDTO userAccountIndexDTO = (UserAccountIndexDTO) o;
    return Objects.equals(this.blizzardId, userAccountIndexDTO.blizzardId) &&
        Objects.equals(this.userName, userAccountIndexDTO.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blizzardId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountIndexDTO {\n");
    sb.append("    blizzardId: ").append(toIndentedString(blizzardId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

