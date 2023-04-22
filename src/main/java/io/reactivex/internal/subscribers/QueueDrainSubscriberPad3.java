package io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
class QueueDrainSubscriberPad3 extends QueueDrainSubscriberPad2 {
    public final AtomicLong requested = new AtomicLong();
}
