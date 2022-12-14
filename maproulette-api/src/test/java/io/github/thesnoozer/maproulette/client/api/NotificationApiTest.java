/*
 * MapRoulette API
 * API for MapRoulette enabling the creation and maintenance of MapRoulette challenges
 *
 * OpenAPI spec version: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelNotificationSubscriptions;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelUserNotification;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for NotificationApi
 */
@Ignore
public class NotificationApiTest {

    private final NotificationApi api = new NotificationApi();

    /**
     * Delete user notifications
     *
     * Deletes the specified user notifications
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteNotificationsTest() throws Exception {
        Long userId = null;
        Object notificationIds = null;
        String apiKey = null;
        api.deleteNotifications(userId, notificationIds, apiKey);

        // TODO: test validations
    }
    /**
     * Retrieves Users notification subscriptions
     *
     * Retrieves the user&#x27;s subscriptions to the various notification types
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNotificationSubscriptionsTest() throws Exception {
        Long userId = null;
        String apiKey = null;
        List<OrgMaprouletteFrameworkModelUserNotification> response = api.getNotificationSubscriptions(userId, apiKey);

        // TODO: test validations
    }
    /**
     * Retrieves Users notifications
     *
     * Retrieves notifications generated for the user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserNotificationsTest() throws Exception {
        Long userId = null;
        String apiKey = null;
        Integer limit = null;
        Integer page = null;
        String sort = null;
        String order = null;
        Integer notificationType = null;
        Integer isRead = null;
        String fromUsername = null;
        List<OrgMaprouletteFrameworkModelUserNotification> response = api.getUserNotifications(userId, apiKey, limit, page, sort, order, notificationType, isRead, fromUsername);

        // TODO: test validations
    }
    /**
     * Mark user notifications as read
     *
     * Marks user notifications as read
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void markNotificationsReadTest() throws Exception {
        Long userId = null;
        Object notificationIds = null;
        String apiKey = null;
        api.markNotificationsRead(userId, notificationIds, apiKey);

        // TODO: test validations
    }
    /**
     * Updates user&#x27;s notification subscriptions
     *
     * Updates the user&#x27;s subscriptions to various notification types
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateNotificationSubscriptionsTest() throws Exception {
        OrgMaprouletteFrameworkModelNotificationSubscriptions body = null;
        String apiKey = null;
        Long userId = null;
        api.updateNotificationSubscriptions(body, apiKey, userId);

        // TODO: test validations
    }
}
