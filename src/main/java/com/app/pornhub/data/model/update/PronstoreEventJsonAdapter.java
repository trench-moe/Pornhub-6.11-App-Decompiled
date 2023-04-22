package com.app.pornhub.data.model.update;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.lang.reflect.Constructor;
import java.util.Objects;
import jd.j;
import kd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/app/pornhub/data/model/update/PronstoreEventJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/update/PronstoreEvent;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "longAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PronstoreEventJsonAdapter extends f<PronstoreEvent> {
    private volatile Constructor<PronstoreEvent> constructorRef;
    private final f<Integer> intAdapter;
    private final f<Long> longAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public PronstoreEventJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "status", "version", "device_id");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"status\", \"version\",\n      \"device_id\")");
        this.options = a10;
        this.longAdapter = a.d(moshi, Long.TYPE, "id", "moshi.adapter(Long::class.java, emptySet(), \"id\")");
        this.intAdapter = a.d(moshi, Integer.TYPE, "status", "moshi.adapter(Int::class…va, emptySet(), \"status\")");
        this.stringAdapter = a.d(moshi, String.class, "deviceId", "moshi.adapter(String::cl…ySet(),\n      \"deviceId\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public PronstoreEvent fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Long l10 = 0L;
        Integer num = 0;
        reader.c();
        int i10 = -1;
        Integer num2 = null;
        String str = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                l10 = this.longAdapter.fromJson(reader);
                if (l10 == null) {
                    JsonDataException n = c.n("id", "id", reader);
                    Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                    throw n;
                }
                i10 &= -2;
            } else if (F == 1) {
                num2 = this.intAdapter.fromJson(reader);
                if (num2 == null) {
                    JsonDataException n10 = c.n("status", "status", reader);
                    Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"status\",…tus\",\n            reader)");
                    throw n10;
                }
            } else if (F == 2) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    JsonDataException n11 = c.n("version", "version", reader);
                    Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"version\"…n\",\n              reader)");
                    throw n11;
                }
                i10 &= -5;
            } else if (F == 3 && (str = this.stringAdapter.fromJson(reader)) == null) {
                JsonDataException n12 = c.n("deviceId", "device_id", reader);
                Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"deviceId…     \"device_id\", reader)");
                throw n12;
            }
        }
        reader.e();
        if (i10 == -6) {
            long longValue = l10.longValue();
            if (num2 == null) {
                JsonDataException h10 = c.h("status", "status", reader);
                Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"status\", \"status\", reader)");
                throw h10;
            }
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            if (str != null) {
                return new PronstoreEvent(longValue, intValue, intValue2, str);
            }
            JsonDataException h11 = c.h("deviceId", "device_id", reader);
            Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"deviceId\", \"device_id\", reader)");
            throw h11;
        }
        Constructor<PronstoreEvent> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = PronstoreEvent.class.getDeclaredConstructor(Long.TYPE, cls, cls, String.class, cls, c.f12069c);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "PronstoreEvent::class.ja…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        objArr[0] = l10;
        if (num2 == null) {
            JsonDataException h12 = c.h("status", "status", reader);
            Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"status\", \"status\", reader)");
            throw h12;
        }
        objArr[1] = Integer.valueOf(num2.intValue());
        objArr[2] = num;
        if (str == null) {
            JsonDataException h13 = c.h("deviceId", "device_id", reader);
            Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"deviceId\", \"device_id\", reader)");
            throw h13;
        }
        objArr[3] = str;
        objArr[4] = Integer.valueOf(i10);
        objArr[5] = null;
        PronstoreEvent newInstance = constructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PronstoreEvent pronstoreEvent) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(pronstoreEvent, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.longAdapter.toJson(writer, (j) Long.valueOf(pronstoreEvent.getId()));
        writer.i("status");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(pronstoreEvent.getStatus()));
        writer.i("version");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(pronstoreEvent.getVersion()));
        writer.i("device_id");
        this.stringAdapter.toJson(writer, (j) pronstoreEvent.getDeviceId());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PronstoreEvent)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PronstoreEvent)";
    }
}
