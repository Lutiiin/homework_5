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
                posts[index] = existPost.copy(
                    id = existPost.id,
                    ownerId = existPost.ownerId
                )
                return true
            }
        }
        return false
    }
}