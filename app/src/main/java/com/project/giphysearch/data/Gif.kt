package com.project.giphysearch.data

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("data") var data: ArrayList<Gif> = arrayListOf(),
    @SerializedName("pagination") var pagination: Pagination? = Pagination(),
    @SerializedName("meta") var meta: Meta? = Meta()
)

data class Gif(
    @SerializedName("type") var type: String? = null,
    @SerializedName("id") var id: String? = null,
    @SerializedName("url") var url: String? = null,
    @SerializedName("slug") var slug: String? = null,
    @SerializedName("bitly_gif_url") var bitlyGifUrl: String? = null,
    @SerializedName("bitly_url") var bitlyUrl: String? = null,
    @SerializedName("embed_url") var embedUrl: String? = null,
    @SerializedName("username") var username: String? = null,
    @SerializedName("source") var source: String? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("rating") var rating: String? = null,
    @SerializedName("content_url") var contentUrl: String? = null,
    @SerializedName("source_tld") var sourceTld: String? = null,
    @SerializedName("source_post_url") var sourcePostUrl: String? = null,
    @SerializedName("is_sticker") var isSticker: Int? = null,
    @SerializedName("import_datetime") var importDatetime: String? = null,
    @SerializedName("trending_datetime") var trendingDatetime: String? = null,
    @SerializedName("images") var images: Images? = Images(),
    @SerializedName("user") var user: User? = User(),
    @SerializedName("analytics_response_payload") var analyticsResponsePayload: String? = null,
)

data class Original(
    @SerializedName("height") var height: String? = null,
    @SerializedName("width") var width: String? = null,
    @SerializedName("size") var size: String? = null,
    @SerializedName("url") var url: String? = null,
    @SerializedName("mp4_size") var mp4Size: String? = null,
    @SerializedName("mp4") var mp4: String? = null,
    @SerializedName("webp_size") var webpSize: String? = null,
    @SerializedName("webp") var webp: String? = null,
    @SerializedName("frames") var frames: String? = null,
    @SerializedName("hash") var hash: String? = null
)

data class Pagination(
    @SerializedName("total_count") var totalCount: Int? = null,
    @SerializedName("count") var count: Int? = null,
    @SerializedName("offset") var offset: Int? = null
)

data class Images(
    @SerializedName("original") var original: Original? = Original()
)

data class User(
    @SerializedName("avatar_url") var avatarUrl: String? = null,
    @SerializedName("banner_image") var bannerImage: String? = null,
    @SerializedName("banner_url") var bannerUrl: String? = null,
    @SerializedName("profile_url") var profileUrl: String? = null,
    @SerializedName("username") var username: String? = null,
    @SerializedName("display_name") var displayName: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("instagram_url") var instagramUrl: String? = null,
    @SerializedName("website_url") var websiteUrl: String? = null,
    @SerializedName("is_verified") var isVerified: Boolean? = null
)

data class Meta(

    @SerializedName("status") var status: Int? = null,
    @SerializedName("msg") var msg: String? = null,
    @SerializedName("response_id") var responseId: String? = null

)