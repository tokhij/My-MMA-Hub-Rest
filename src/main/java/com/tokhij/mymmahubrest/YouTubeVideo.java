package com.tokhij.mymmahubrest;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity(name = "youtube_video")
@Data
@EqualsAndHashCode(callSuper=true)
public class YouTubeVideo extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "url")
    private String url;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;

    @Column(name = "description")
    private String description;

    @Column(name = "published_date")
    private String publishedDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "channel_id", referencedColumnName = "channel_id")
    private YoutubeChannelInfo channelInfo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "video_stat_id", referencedColumnName = "video_id")
    private YoutubeVideoStatistics videoStatistics;
}
