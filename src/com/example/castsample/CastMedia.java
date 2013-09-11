/*
 * Copyright (C) 2013 Google Inc. All Rights Reserved. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package com.example.castsample;

/**
 * A storage class containing the title and URL of a piece of playable media.
 */
public class CastMedia {

    private String mTitle;
    private String mVideoUrl;

    /**
     * Creates a new CastMedia object for the media with the given title and URL.
     */
    public CastMedia(String title, String videoUrl) {
        mTitle = title;
        mVideoUrl = videoUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mVideoUrl;
    }
}
