/*
 * Copyright 2017 Futurice GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.futurice.freesound.network.api;

import com.futurice.freesound.network.api.model.AccessToken;
import com.futurice.freesound.network.api.model.SoundSearchResult;
import com.futurice.freesound.network.api.model.User;

import android.support.annotation.NonNull;

import io.reactivex.Single;

/**
 * The application access interface for interactions with the Freesound API.
 */
public interface FreeSoundApiService {

    @NonNull
    Single<User> getUser(@NonNull final String user);

    @NonNull
    Single<AccessToken> getAccessToken(@NonNull String code);

    @NonNull
    Single<SoundSearchResult> search(@NonNull String query);
}
