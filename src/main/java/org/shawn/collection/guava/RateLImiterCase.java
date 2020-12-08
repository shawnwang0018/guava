package org.shawn.collection.guava;

import com.google.common.util.concurrent.RateLimiter;

public class RateLImiterCase {
    public static void main(String[] args) {
        RateLimiter rateLimiter = RateLimiter.create(5.0);
    }
}
