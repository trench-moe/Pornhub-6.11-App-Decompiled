package com.app.pornhub.data.model;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/app/pornhub/data/model/ErrorModel;", BuildConfig.FLAVOR, "code", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorModel {
    private final int code;
    private final String message;

    public ErrorModel(int i10, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i10;
        this.message = message;
    }

    public static /* synthetic */ ErrorModel copy$default(ErrorModel errorModel, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = errorModel.code;
        }
        if ((i11 & 2) != 0) {
            str = errorModel.message;
        }
        return errorModel.copy(i10, str);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final ErrorModel copy(int i10, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new ErrorModel(i10, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorModel) {
            ErrorModel errorModel = (ErrorModel) obj;
            return this.code == errorModel.code && Intrinsics.areEqual(this.message, errorModel.message);
        }
        return false;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.code * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("ErrorModel(code=");
        m10.append(this.code);
        m10.append(", message=");
        return b.l(m10, this.message, ')');
    }
}
