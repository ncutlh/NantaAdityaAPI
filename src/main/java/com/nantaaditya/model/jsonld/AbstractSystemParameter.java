package com.nantaaditya.model.jsonld;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// @formatter:off
/**
 * Author : Pramuditya Ananta Nur
  * www.nantaaditya.com
  * personal@nantaaditya.com
  **/
// @formatter:on

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbstractSystemParameter {

  @JsonProperty("@context")
  private String context;
  @JsonProperty("@type")
  private String type;
}