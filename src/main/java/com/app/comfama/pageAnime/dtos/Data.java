
package com.app.comfama.pageAnime.dtos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Data {

    @JsonProperty("mal_id")
    private Integer malId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("approved")
    private Boolean approved;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_english")
    private String titleEnglish;
    @JsonProperty("title_japanese")
    private String titleJapanese;
    @JsonProperty("title_synonyms")
    private List<Object> titleSynonyms = null;
    @JsonProperty("type")
    private String type;
    @JsonProperty("source")
    private String source;
    @JsonProperty("episodes")
    private Integer episodes;
    @JsonProperty("status")
    private String status;
    @JsonProperty("airing")
    private Boolean airing;
    @JsonProperty("aired")
    private Aired aired;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("score")
    private Float score;
    @JsonProperty("scored_by")
    private Integer scoredBy;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("popularity")
    private Integer popularity;
    @JsonProperty("members")
    private Integer members;
    @JsonProperty("favorites")
    private Integer favorites;
    @JsonProperty("synopsis")
    private String synopsis;
    @JsonProperty("background")
    private String background;
    @JsonProperty("season")
    private String season;
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("producers")
    private List<Producer> producers = null;
    @JsonProperty("genres")
    private List<Genre> genres = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	

    
}
