package com.app.pornhub.data.model.pornstar;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.lang.reflect.Constructor;
import java.util.Objects;
import jd.j;
import kd.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformerModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/pornstar/PerformerModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", BuildConfig.FLAVOR, "booleanAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PerformerModelJsonAdapter extends f<PerformerModel> {
    private final f<Boolean> booleanAdapter;
    private volatile Constructor<PerformerModel> constructorRef;
    private final f<Integer> intAdapter;
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public PerformerModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("slug", AppMeasurementSdk.ConditionalUserProperty.NAME, "thumb", "rank", "views", "rating", "numberOfVideos", "isPremium", "isVerified", "performerType", "bio", "born", "birthplace", "Height", "Weight", "subscribers", "weeklyRank", "yearlyRank", "lastMonthRank", "cover", "previuosPornstarSlug", "nextPornstarSlug", "trophy");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"slug\", \"name\", \"thum…tPornstarSlug\", \"trophy\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "slug", "moshi.adapter(String::cl…emptySet(),\n      \"slug\")");
        this.intAdapter = a.d(moshi, Integer.TYPE, "numberOfVideos", "moshi.adapter(Int::class…,\n      \"numberOfVideos\")");
        this.booleanAdapter = a.d(moshi, Boolean.TYPE, "isPremium", "moshi.adapter(Boolean::c…Set(),\n      \"isPremium\")");
        this.nullableStringAdapter = a.d(moshi, String.class, "previuosPornstarSlug", "moshi.adapter(String::cl…, \"previuosPornstarSlug\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public PerformerModel fromJson(JsonReader reader) {
        String str;
        int i10;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        int i11 = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        while (true) {
            String str21 = str2;
            String str22 = str3;
            String str23 = str4;
            String str24 = str11;
            String str25 = str12;
            String str26 = str13;
            String str27 = str14;
            String str28 = str10;
            String str29 = str9;
            String str30 = str8;
            String str31 = str7;
            if (!reader.h()) {
                String str32 = str6;
                reader.e();
                if (i11 == -4193281) {
                    if (str5 == null) {
                        JsonDataException h10 = c.h("slug", "slug", reader);
                        Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"slug\", \"slug\", reader)");
                        throw h10;
                    } else if (str32 == null) {
                        JsonDataException h11 = c.h(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                        Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"name\", \"name\", reader)");
                        throw h11;
                    } else if (str31 == null) {
                        JsonDataException h12 = c.h("thumb", "thumb", reader);
                        Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"thumb\", \"thumb\", reader)");
                        throw h12;
                    } else if (str30 == null) {
                        JsonDataException h13 = c.h("rank", "rank", reader);
                        Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"rank\", \"rank\", reader)");
                        throw h13;
                    } else if (str29 == null) {
                        JsonDataException h14 = c.h("views", "views", reader);
                        Intrinsics.checkNotNullExpressionValue(h14, "missingProperty(\"views\", \"views\", reader)");
                        throw h14;
                    } else if (str28 == null) {
                        JsonDataException h15 = c.h("rating", "rating", reader);
                        Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"rating\", \"rating\", reader)");
                        throw h15;
                    } else if (num == null) {
                        JsonDataException h16 = c.h("numberOfVideos", "numberOfVideos", reader);
                        Intrinsics.checkNotNullExpressionValue(h16, "missingProperty(\"numberO…\"numberOfVideos\", reader)");
                        throw h16;
                    } else {
                        int intValue = num.intValue();
                        if (bool == null) {
                            JsonDataException h17 = c.h("isPremium", "isPremium", reader);
                            Intrinsics.checkNotNullExpressionValue(h17, "missingProperty(\"isPremium\", \"isPremium\", reader)");
                            throw h17;
                        }
                        boolean booleanValue = bool.booleanValue();
                        if (bool2 == null) {
                            JsonDataException h18 = c.h("isVerified", "isVerified", reader);
                            Intrinsics.checkNotNullExpressionValue(h18, "missingProperty(\"isVerif…d\", \"isVerified\", reader)");
                            throw h18;
                        }
                        boolean booleanValue2 = bool2.booleanValue();
                        if (str27 == null) {
                            JsonDataException h19 = c.h("performerType", "performerType", reader);
                            Intrinsics.checkNotNullExpressionValue(h19, "missingProperty(\"perform… \"performerType\", reader)");
                            throw h19;
                        }
                        Objects.requireNonNull(str26, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str25, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str24, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str23, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str22, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str21, "null cannot be cast to non-null type kotlin.String");
                        String str33 = str17;
                        Objects.requireNonNull(str33, "null cannot be cast to non-null type kotlin.String");
                        String str34 = str18;
                        Objects.requireNonNull(str34, "null cannot be cast to non-null type kotlin.String");
                        String str35 = str19;
                        Objects.requireNonNull(str35, "null cannot be cast to non-null type kotlin.String");
                        String str36 = str20;
                        Objects.requireNonNull(str36, "null cannot be cast to non-null type kotlin.String");
                        if (bool3 != null) {
                            return new PerformerModel(str5, str32, str31, str30, str29, str28, intValue, booleanValue, booleanValue2, str27, str26, str25, str24, str23, str22, str21, str33, str34, str35, str36, str15, str16, bool3.booleanValue());
                        }
                        JsonDataException h20 = c.h("trophy", "trophy", reader);
                        Intrinsics.checkNotNullExpressionValue(h20, "missingProperty(\"trophy\", \"trophy\", reader)");
                        throw h20;
                    }
                }
                String str37 = str20;
                Constructor<PerformerModel> constructor = this.constructorRef;
                if (constructor == null) {
                    str = "thumb";
                    Class cls = Integer.TYPE;
                    Class cls2 = Boolean.TYPE;
                    constructor = PerformerModel.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, cls, cls2, cls2, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls2, cls, c.f12069c);
                    this.constructorRef = constructor;
                    Unit unit = Unit.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(constructor, "PerformerModel::class.ja…his.constructorRef = it }");
                } else {
                    str = "thumb";
                }
                Object[] objArr = new Object[25];
                if (str5 == null) {
                    JsonDataException h21 = c.h("slug", "slug", reader);
                    Intrinsics.checkNotNullExpressionValue(h21, "missingProperty(\"slug\", \"slug\", reader)");
                    throw h21;
                }
                objArr[0] = str5;
                if (str32 == null) {
                    JsonDataException h22 = c.h(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    Intrinsics.checkNotNullExpressionValue(h22, "missingProperty(\"name\", \"name\", reader)");
                    throw h22;
                }
                objArr[1] = str32;
                if (str31 == null) {
                    String str38 = str;
                    JsonDataException h23 = c.h(str38, str38, reader);
                    Intrinsics.checkNotNullExpressionValue(h23, "missingProperty(\"thumb\", \"thumb\", reader)");
                    throw h23;
                }
                objArr[2] = str31;
                if (str30 == null) {
                    JsonDataException h24 = c.h("rank", "rank", reader);
                    Intrinsics.checkNotNullExpressionValue(h24, "missingProperty(\"rank\", \"rank\", reader)");
                    throw h24;
                }
                objArr[3] = str30;
                if (str29 == null) {
                    JsonDataException h25 = c.h("views", "views", reader);
                    Intrinsics.checkNotNullExpressionValue(h25, "missingProperty(\"views\", \"views\", reader)");
                    throw h25;
                }
                objArr[4] = str29;
                if (str28 == null) {
                    JsonDataException h26 = c.h("rating", "rating", reader);
                    Intrinsics.checkNotNullExpressionValue(h26, "missingProperty(\"rating\", \"rating\", reader)");
                    throw h26;
                }
                objArr[5] = str28;
                if (num == null) {
                    JsonDataException h27 = c.h("numberOfVideos", "numberOfVideos", reader);
                    Intrinsics.checkNotNullExpressionValue(h27, "missingProperty(\"numberO…\"numberOfVideos\", reader)");
                    throw h27;
                }
                objArr[6] = Integer.valueOf(num.intValue());
                if (bool == null) {
                    JsonDataException h28 = c.h("isPremium", "isPremium", reader);
                    Intrinsics.checkNotNullExpressionValue(h28, "missingProperty(\"isPremium\", \"isPremium\", reader)");
                    throw h28;
                }
                objArr[7] = Boolean.valueOf(bool.booleanValue());
                if (bool2 == null) {
                    JsonDataException h29 = c.h("isVerified", "isVerified", reader);
                    Intrinsics.checkNotNullExpressionValue(h29, "missingProperty(\"isVerif…d\", \"isVerified\", reader)");
                    throw h29;
                }
                objArr[8] = Boolean.valueOf(bool2.booleanValue());
                if (str27 == null) {
                    JsonDataException h30 = c.h("performerType", "performerType", reader);
                    Intrinsics.checkNotNullExpressionValue(h30, "missingProperty(\"perform… \"performerType\", reader)");
                    throw h30;
                }
                objArr[9] = str27;
                objArr[10] = str26;
                objArr[11] = str25;
                objArr[12] = str24;
                objArr[13] = str23;
                objArr[14] = str22;
                objArr[15] = str21;
                objArr[16] = str17;
                objArr[17] = str18;
                objArr[18] = str19;
                objArr[19] = str37;
                objArr[20] = str15;
                objArr[21] = str16;
                if (bool3 == null) {
                    JsonDataException h31 = c.h("trophy", "trophy", reader);
                    Intrinsics.checkNotNullExpressionValue(h31, "missingProperty(\"trophy\", \"trophy\", reader)");
                    throw h31;
                }
                objArr[22] = Boolean.valueOf(bool3.booleanValue());
                objArr[23] = Integer.valueOf(i11);
                objArr[24] = null;
                PerformerModel newInstance = constructor.newInstance(objArr);
                Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            String str39 = str6;
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 0:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n = c.n("slug", "slug", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"slug\", \"slug\",\n            reader)");
                        throw n;
                    }
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 1:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        JsonDataException n10 = c.n(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"name\", \"name\",\n            reader)");
                        throw n10;
                    }
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 2:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        JsonDataException n11 = c.n("thumb", "thumb", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"thumb\", …umb\",\n            reader)");
                        throw n11;
                    }
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    continue;
                case 3:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        JsonDataException n12 = c.n("rank", "rank", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"rank\", \"rank\",\n            reader)");
                        throw n12;
                    }
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    break;
                case 4:
                    str9 = this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        JsonDataException n13 = c.n("views", "views", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"views\", …ews\",\n            reader)");
                        throw n13;
                    }
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str8 = str30;
                    break;
                case 5:
                    str10 = this.stringAdapter.fromJson(reader);
                    if (str10 == null) {
                        JsonDataException n14 = c.n("rating", "rating", reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"rating\",…        \"rating\", reader)");
                        throw n14;
                    }
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 6:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        JsonDataException n15 = c.n("numberOfVideos", "numberOfVideos", reader);
                        Intrinsics.checkNotNullExpressionValue(n15, "unexpectedNull(\"numberOf…\"numberOfVideos\", reader)");
                        throw n15;
                    }
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 7:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        JsonDataException n16 = c.n("isPremium", "isPremium", reader);
                        Intrinsics.checkNotNullExpressionValue(n16, "unexpectedNull(\"isPremiu…     \"isPremium\", reader)");
                        throw n16;
                    }
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        JsonDataException n17 = c.n("isVerified", "isVerified", reader);
                        Intrinsics.checkNotNullExpressionValue(n17, "unexpectedNull(\"isVerifi…    \"isVerified\", reader)");
                        throw n17;
                    }
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 9:
                    str14 = this.stringAdapter.fromJson(reader);
                    if (str14 == null) {
                        JsonDataException n18 = c.n("performerType", "performerType", reader);
                        Intrinsics.checkNotNullExpressionValue(n18, "unexpectedNull(\"performe… \"performerType\", reader)");
                        throw n18;
                    }
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 10:
                    str13 = this.stringAdapter.fromJson(reader);
                    if (str13 == null) {
                        JsonDataException n19 = c.n("bio", "bio", reader);
                        Intrinsics.checkNotNullExpressionValue(n19, "unexpectedNull(\"bio\", \"bio\", reader)");
                        throw n19;
                    }
                    i11 &= -1025;
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 11:
                    str12 = this.stringAdapter.fromJson(reader);
                    if (str12 == null) {
                        JsonDataException n20 = c.n("born", "born", reader);
                        Intrinsics.checkNotNullExpressionValue(n20, "unexpectedNull(\"born\", \"born\", reader)");
                        throw n20;
                    }
                    i11 &= -2049;
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 12:
                    str11 = this.stringAdapter.fromJson(reader);
                    if (str11 == null) {
                        JsonDataException n21 = c.n("birthplace", "birthplace", reader);
                        Intrinsics.checkNotNullExpressionValue(n21, "unexpectedNull(\"birthpla…    \"birthplace\", reader)");
                        throw n21;
                    }
                    i11 &= -4097;
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 13:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n22 = c.n("Height", "Height", reader);
                        Intrinsics.checkNotNullExpressionValue(n22, "unexpectedNull(\"Height\",…t\",\n              reader)");
                        throw n22;
                    }
                    i11 &= -8193;
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 14:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n23 = c.n("Weight", "Weight", reader);
                        Intrinsics.checkNotNullExpressionValue(n23, "unexpectedNull(\"Weight\",…t\",\n              reader)");
                        throw n23;
                    }
                    i11 &= -16385;
                    str6 = str39;
                    str2 = str21;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 15:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n24 = c.n("subscribers", "subscribers", reader);
                        Intrinsics.checkNotNullExpressionValue(n24, "unexpectedNull(\"subscrib…   \"subscribers\", reader)");
                        throw n24;
                    }
                    i11 &= -32769;
                    str6 = str39;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 16:
                    str17 = this.stringAdapter.fromJson(reader);
                    if (str17 == null) {
                        JsonDataException n25 = c.n("weeklyRank", "weeklyRank", reader);
                        Intrinsics.checkNotNullExpressionValue(n25, "unexpectedNull(\"weeklyRa…    \"weeklyRank\", reader)");
                        throw n25;
                    }
                    i10 = -65537;
                    i11 &= i10;
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 17:
                    str18 = this.stringAdapter.fromJson(reader);
                    if (str18 == null) {
                        JsonDataException n26 = c.n("yearlyRank", "yearlyRank", reader);
                        Intrinsics.checkNotNullExpressionValue(n26, "unexpectedNull(\"yearlyRa…    \"yearlyRank\", reader)");
                        throw n26;
                    }
                    i10 = -131073;
                    i11 &= i10;
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 18:
                    str19 = this.stringAdapter.fromJson(reader);
                    if (str19 == null) {
                        JsonDataException n27 = c.n("lastMonthRank", "lastMonthRank", reader);
                        Intrinsics.checkNotNullExpressionValue(n27, "unexpectedNull(\"lastMont… \"lastMonthRank\", reader)");
                        throw n27;
                    }
                    i10 = -262145;
                    i11 &= i10;
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 19:
                    str20 = this.stringAdapter.fromJson(reader);
                    if (str20 == null) {
                        JsonDataException n28 = c.n("cover", "cover", reader);
                        Intrinsics.checkNotNullExpressionValue(n28, "unexpectedNull(\"cover\", …r\",\n              reader)");
                        throw n28;
                    }
                    i10 = -524289;
                    i11 &= i10;
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 20:
                    str15 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -1048577;
                    i11 &= i10;
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 21:
                    str16 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -2097153;
                    i11 &= i10;
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                case 22:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        JsonDataException n29 = c.n("trophy", "trophy", reader);
                        Intrinsics.checkNotNullExpressionValue(n29, "unexpectedNull(\"trophy\",…        \"trophy\", reader)");
                        throw n29;
                    }
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
                default:
                    str6 = str39;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str11 = str24;
                    str12 = str25;
                    str13 = str26;
                    str14 = str27;
                    str10 = str28;
                    str9 = str29;
                    str8 = str30;
                    break;
            }
            str7 = str31;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PerformerModel performerModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(performerModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("slug");
        this.stringAdapter.toJson(writer, (j) performerModel.getSlug());
        writer.i(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.toJson(writer, (j) performerModel.getName());
        writer.i("thumb");
        this.stringAdapter.toJson(writer, (j) performerModel.getThumb());
        writer.i("rank");
        this.stringAdapter.toJson(writer, (j) performerModel.getRank());
        writer.i("views");
        this.stringAdapter.toJson(writer, (j) performerModel.getViews());
        writer.i("rating");
        this.stringAdapter.toJson(writer, (j) performerModel.getRating());
        writer.i("numberOfVideos");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(performerModel.getNumberOfVideos()));
        writer.i("isPremium");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(performerModel.isPremium()));
        writer.i("isVerified");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(performerModel.isVerified()));
        writer.i("performerType");
        this.stringAdapter.toJson(writer, (j) performerModel.getPerformerType());
        writer.i("bio");
        this.stringAdapter.toJson(writer, (j) performerModel.getBio());
        writer.i("born");
        this.stringAdapter.toJson(writer, (j) performerModel.getBorn());
        writer.i("birthplace");
        this.stringAdapter.toJson(writer, (j) performerModel.getBirthplace());
        writer.i("Height");
        this.stringAdapter.toJson(writer, (j) performerModel.getHeight());
        writer.i("Weight");
        this.stringAdapter.toJson(writer, (j) performerModel.getWeight());
        writer.i("subscribers");
        this.stringAdapter.toJson(writer, (j) performerModel.getSubscribers());
        writer.i("weeklyRank");
        this.stringAdapter.toJson(writer, (j) performerModel.getWeeklyRank());
        writer.i("yearlyRank");
        this.stringAdapter.toJson(writer, (j) performerModel.getYearlyRank());
        writer.i("lastMonthRank");
        this.stringAdapter.toJson(writer, (j) performerModel.getLastMonthRank());
        writer.i("cover");
        this.stringAdapter.toJson(writer, (j) performerModel.getCover());
        writer.i("previuosPornstarSlug");
        this.nullableStringAdapter.toJson(writer, (j) performerModel.getPreviuosPornstarSlug());
        writer.i("nextPornstarSlug");
        this.nullableStringAdapter.toJson(writer, (j) performerModel.getNextPornstarSlug());
        writer.i("trophy");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(performerModel.getTrophy()));
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PerformerModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PerformerModel)";
    }
}
