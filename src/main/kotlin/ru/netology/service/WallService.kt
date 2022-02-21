package ru.netology.service

import ru.netology.data.Post

class WallService {
    private var posts = emptyArray<Post>()
    private var nextId = 0

    fun add(post: Post): Post {
        nextId +=1
        val newPost = post.copy(id = nextId)
        posts += newPost
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for((index, existPost) in posts.withIndex()){
            if (existPost.id == post.id){
                posts[index] = post.copy(
                    id = existPost.id,
                    ownerId = existPost.ownerId,
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    date = post.date,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavourite = post.isFavourite,
                    donut = post.donut,
                    postponedId = post.postponedId
                )
                return true
            }
        }
        return false
    }
}