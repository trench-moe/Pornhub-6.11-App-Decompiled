package x2;

import com.app.pornhub.data.model.pornstar.PerformerAdditionalFiltersModel;
import com.app.pornhub.data.model.pornstar.PerformerConfigModel;
import com.app.pornhub.data.model.pornstar.PerformerIncompatibleFilterChoiceModel;
import com.app.pornhub.data.model.pornstar.PerformerOptionsModel;
import com.app.pornhub.data.model.pornstar.PerformerResponse;
import com.app.pornhub.domain.model.performer.PerformerAdditionalFilter;
import com.app.pornhub.domain.model.performer.PerformerIncompatibleFilterChoice;
import com.app.pornhub.domain.model.performer.PerformerOrder;
import com.app.pornhub.domain.model.performer.PerformerSortingConfig;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17849c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t0 f17850f;

    public /* synthetic */ s0(t0 t0Var, int i10) {
        this.f17849c = i10;
        this.f17850f = t0Var;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        List list;
        List list2;
        switch (this.f17849c) {
            case 0:
                t0 this$0 = this.f17850f;
                PerformerResponse it = (PerformerResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                return this$0.f17860b.q(it);
            default:
                t0 this$02 = this.f17850f;
                PerformerConfigModel performerConfigModel = (PerformerConfigModel) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(performerConfigModel, "it");
                Objects.requireNonNull(this$02.f17860b);
                Intrinsics.checkNotNullParameter(performerConfigModel, "performerConfigModel");
                List<PerformerOptionsModel> options = performerConfigModel.getOptions();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
                for (PerformerOptionsModel performerOptionsModel : options) {
                    String title = performerOptionsModel.getTitle();
                    String value = performerOptionsModel.getValue();
                    Map<String, String> filter = performerOptionsModel.getFilter();
                    if (filter == null) {
                        filter = new LinkedHashMap<>();
                    }
                    arrayList.add(new PerformerOrder(title, value, filter));
                }
                List<PerformerAdditionalFiltersModel> additionalFilters = performerConfigModel.getAdditionalFilters();
                if (additionalFilters == null) {
                    list = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(additionalFilters, 10));
                    for (PerformerAdditionalFiltersModel performerAdditionalFiltersModel : additionalFilters) {
                        String title2 = performerAdditionalFiltersModel.getTitle();
                        String value2 = performerAdditionalFiltersModel.getValue();
                        List<String> options2 = performerAdditionalFiltersModel.getOptions();
                        List<PerformerIncompatibleFilterChoiceModel> incompatibleChoice = performerAdditionalFiltersModel.getIncompatibleChoice();
                        if (incompatibleChoice == null) {
                            list2 = CollectionsKt.emptyList();
                        } else {
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(incompatibleChoice, 10));
                            for (PerformerIncompatibleFilterChoiceModel performerIncompatibleFilterChoiceModel : incompatibleChoice) {
                                arrayList3.add(new PerformerIncompatibleFilterChoice(performerIncompatibleFilterChoiceModel.getOption(), performerIncompatibleFilterChoiceModel.getFilterValues()));
                            }
                            list2 = arrayList3;
                        }
                        arrayList2.add(new PerformerAdditionalFilter(title2, value2, options2, list2));
                    }
                    list = arrayList2;
                }
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                PerformerSortingConfig performerSortingConfig = new PerformerSortingConfig(arrayList, list);
                this$02.f17862e = performerSortingConfig;
                return performerSortingConfig;
        }
    }
}
