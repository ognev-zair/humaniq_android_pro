package com.humaniq.pro.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.ArrayList

/**
 * Created by gritsay on 7/26/17.
 */

open class GithubEntitty {
  @SerializedName("id")
  @Expose
  open var id: Int = 0

  @SerializedName("avatar_url")
  @Expose
  open var avatarUrl: String? = null

  @SerializedName("name")
  @Expose
  open var name: String? = null

  @SerializedName("public_repos")
  @Expose
  open var publicRepos: Int? = null

}
