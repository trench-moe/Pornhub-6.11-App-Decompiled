package com.app.pornhub.data.model;

import a0.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/app/pornhub/data/model/ResultResponse;", BuildConfig.FLAVOR, "result", BuildConfig.FLAVOR, "(Z)V", "getResult", "()Z", "component1", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResultResponse {
    private final boolean result;

    public ResultResponse(boolean z10) {
        this.result = z10;
    }

    public static /* synthetic */ ResultResponse copy$default(ResultResponse resultResponse, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = resultResponse.result;
        }
        return resultResponse.copy(z10);
    }

    public final boolean component1() {
        return this.result;
    }

    public final ResultResponse copy(boolean z10) {
        return new ResultResponse(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ResultResponse) && this.result == ((ResultResponse) obj).result) {
            return true;
        }
        return false;
    }

    public final boolean getResult() {
        return this.result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    public int hashCode() {
        boolean z10 = this.result;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return r02;
    }

    public String toString() {
        return a.l(a1.a.m("ResultResponse(result="), this.result, ')');
    }
}
