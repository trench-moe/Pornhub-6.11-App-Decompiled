package com.app.pornhub.data.model.categories;

import android.support.v4.media.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/data/model/categories/CategoriesResponse;", BuildConfig.FLAVOR, "topCategories", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/categories/CategoryModel;", "allCategories", "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Ljava/util/List;Ljava/util/List;Lcom/app/pornhub/data/model/ErrorModel;)V", "getAllCategories", "()Ljava/util/List;", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getTopCategories", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CategoriesResponse {
    private final List<CategoryModel> allCategories;
    private final ErrorModel error;
    private final List<CategoryModel> topCategories;

    public CategoriesResponse(@f(name = "top_categories") List<CategoryModel> topCategories, @f(name = "all_categories") List<CategoryModel> allCategories, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(topCategories, "topCategories");
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        this.topCategories = topCategories;
        this.allCategories = allCategories;
        this.error = errorModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoriesResponse copy$default(CategoriesResponse categoriesResponse, List list, List list2, ErrorModel errorModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = categoriesResponse.topCategories;
        }
        if ((i10 & 2) != 0) {
            list2 = categoriesResponse.allCategories;
        }
        if ((i10 & 4) != 0) {
            errorModel = categoriesResponse.error;
        }
        return categoriesResponse.copy(list, list2, errorModel);
    }

    public final List<CategoryModel> component1() {
        return this.topCategories;
    }

    public final List<CategoryModel> component2() {
        return this.allCategories;
    }

    public final ErrorModel component3() {
        return this.error;
    }

    public final CategoriesResponse copy(@f(name = "top_categories") List<CategoryModel> topCategories, @f(name = "all_categories") List<CategoryModel> allCategories, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(topCategories, "topCategories");
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        return new CategoriesResponse(topCategories, allCategories, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CategoriesResponse) {
            CategoriesResponse categoriesResponse = (CategoriesResponse) obj;
            if (Intrinsics.areEqual(this.topCategories, categoriesResponse.topCategories) && Intrinsics.areEqual(this.allCategories, categoriesResponse.allCategories) && Intrinsics.areEqual(this.error, categoriesResponse.error)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<CategoryModel> getAllCategories() {
        return this.allCategories;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final List<CategoryModel> getTopCategories() {
        return this.topCategories;
    }

    public int hashCode() {
        int b10 = a.b(this.allCategories, this.topCategories.hashCode() * 31, 31);
        ErrorModel errorModel = this.error;
        return b10 + (errorModel == null ? 0 : errorModel.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("CategoriesResponse(topCategories=");
        m10.append(this.topCategories);
        m10.append(", allCategories=");
        m10.append(this.allCategories);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
