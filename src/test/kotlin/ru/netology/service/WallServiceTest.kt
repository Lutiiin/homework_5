package ru.netology.service

import junit.framework.Assert.assertTrue
import junit.framework.AssertionFailedError
import org.junit.Test
import ru.netology.data.Post


class WallServiceTest {

    @Test
    fun updateExisting() {
        val service = WallService()
        service.add(Post(
            id = 0,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = 12345,
            text = "First post",
            replyOwnerId = 3,
            replyPostId = 2,
            friendsOnly = true,
            comments = {},
            copyright = {},
            likes = {},
            reposts = {},
            views = {},
            postType = "Type first",
            canDelete = true,
            canEdit = true,
            canPin = true,
            donut = {},
            isFavourite = false,
            isPinned = 1,
            markedAsAds = false,
            postponedId = 3,
            signerId = 2
        ))

        service.add(Post(
            id = 0,
            ownerId = 23,
            fromId = 65,
            createdBy = 3,
            date = 25341,
            text = "Second post",
            replyOwnerId = 34,
            replyPostId = 21,
            friendsOnly = false,
            comments = {},
            copyright = {},
            likes = {},
            reposts = {},
            views = {},
            postType = "Type second",
            canDelete = false,
            canEdit = false,
            canPin = false,
            donut = {},
            isFavourite = false,
            isPinned = 0,
            markedAsAds = true,
            postponedId = 23,
            signerId = 25))

        val update = Post(
            id = 10,
            ownerId = 23,
            fromId = 65,
            createdBy = 3,
            date = 25341,
            text = "Updated post",
            replyOwnerId = 34,
            replyPostId = 21,
            friendsOnly = false,
            comments = {},
            copyright = {},
            likes = {},
            reposts = {},
            views = {},
            postType = "Type updated",
            canDelete = false,
            canEdit = false,
            canPin = false,
            donut = {},
            isFavourite = false,
            isPinned = 0,
            markedAsAds = true,
            postponedId = 23,
            signerId = 25)

        val result = service.update(update)
        assertTrue(result)
    }
}