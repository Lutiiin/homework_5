package ru.netology.service

import ru.netology.data.Post

object WallService {
    private var posts = emptyArray<Post>()
    private var nextId = 0

    fun add(post: Post): Post {
        nextId +=1
        val newPost = post.copy(id = nextId)
        posts += newPost
        return posts.last()
    }

    fun update(post: Post) {
        for((index, post) in posts.withIndex()){
            if (post.id == nextId){
                nextId +=1
                posts[index] = post.copy(
                    id = nextId,
                    fromId = 1,
                    createdBy = 1,
                    text = "Some text",
                    replyOwnerId = 1,
                    replyPostId = 1,
                    friendsOnly = true,
                    comments = {},
                    copyright = {},
                    likes = {},
                    reposts = {},
                    views = {},
                    postType = "Some type",
                    signerId = 6,
                    canPin = true,
                    canDelete = true,
                    canEdit = true,
                    isPinned = 6,
                    markedAsAds = true,
                    isFavourite = true,
                    donut = {},
                    postponedId = 9
                )
            }
        }
    }
}