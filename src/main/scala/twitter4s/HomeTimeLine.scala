package twitter4s


/**
  * parse result contains this case class
  * Created by lrf141 on 17/09/23.
  * @since 1.0.0
  * @author lrf141
  *
  * @param created_at tweet made time
  * @param id_str tweet id as String
  * @param text tweet text
  * @param id tweet id as Long
  * @param retweet_count retweet count as Int
  * @param user user object in response json
  */
case class HomeTimeLine(created_at: String,
                        id_str: String,
                        text: String,
                        id: Long,
                        retweet_count: Int,
                        user: TimeLineUser
                       )