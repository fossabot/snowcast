/*
 * Copyright (c) 2015-2017, Christoph Engelbert (aka noctarius) and
 * contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.noctarius.snowcast.impl;

import com.hazelcast.client.impl.protocol.ClientMessage;
import com.hazelcast.core.ICompletableFuture;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

interface ClientInvocator {

    @Nonnull
    ICompletableFuture<ClientMessage> invoke(@Nonnegative int partitionId, @Nonnull ClientMessage request);

}
