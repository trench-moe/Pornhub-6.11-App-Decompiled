package u4;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import b3.o;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.video.VideoFilters;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.disposables.CompositeDisposable;
import java.util.Objects;
import z2.cp;

/* loaded from: classes2.dex */
public class d extends androidx.fragment.app.l implements cp {
    public static final String U0 = d.class.getSimpleName();
    public f3.h D0;
    public d3.a E0;
    public k2.c F0;
    public o3.i G0;
    public CompositeDisposable H0;
    public Spinner I0;
    public Spinner J0;
    public Spinner K0;
    public Spinner L0;
    public ArrayAdapter<String> M0;
    public ArrayAdapter<String> N0;
    public ArrayAdapter<String> O0;
    public ArrayAdapter<String> P0;
    public ArrayAdapter<String> Q0;
    public b R0;
    public VideoFilters S0;
    public boolean T0;

    /* loaded from: classes2.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        public b(a aVar) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            kf.a.f12078a.a("Parent: %s, View: %s, position: %s, id: %s", Integer.valueOf(adapterView.getId()), view, Integer.valueOf(i10), Long.valueOf(j10));
            int id2 = adapterView.getId();
            int id3 = d.this.I0.getId();
            String str = BuildConfig.FLAVOR;
            if (id2 == id3) {
                d dVar = d.this;
                if (dVar.T0) {
                    if (i10 != 0) {
                        str = dVar.N0.getItem(i10);
                    }
                } else if (i10 != 0) {
                    str = dVar.M0.getItem(i10);
                }
                d.this.S0.setQuality(str);
            } else if (adapterView.getId() == d.this.J0.getId()) {
                if (i10 != 0) {
                    str = d.this.O0.getItem(i10);
                }
                d.this.S0.setProduction(str);
            } else if (adapterView.getId() == d.this.K0.getId()) {
                if (i10 != 0) {
                    str = d.this.P0.getItem(i10);
                }
                d.this.S0.setDuration(str);
            } else if (adapterView.getId() == d.this.L0.getId()) {
                if (i10 != 0) {
                    str = d.this.Q0.getItem(i10);
                }
                d.this.S0.setCategory(str);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        this.T0 = UsersConfig.isPremiumAllowed(this.D0.a());
        this.S0 = ((o) this.F0.f11775f).m().copy();
        b.a title = new b.a(n(), R.style.VideoFiltersDialogStyle).setTitle(I(R.string.filter_dialog_title));
        title.c(I(R.string.apply), new DialogInterface.OnClickListener() { // from class: u4.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                d dVar = d.this;
                kf.a.f12078a.a(dVar.S0.toString(), new Object[0]);
                dVar.G0.a(dVar.S0);
            }
        });
        title.b(I(R.string.cancel), t3.n.f15123j);
        u4.b bVar = u4.b.f15527f;
        AlertController.b bVar2 = title.f496a;
        bVar2.f485k = bVar2.f476a.getText(R.string.clear);
        title.f496a.f486l = bVar;
        final View inflate = View.inflate(new j.c(q(), (int) R.style.ThemeFiltersDialogLight), R.layout.fragment_filters_dialog, null);
        S0(inflate);
        title.setView(inflate);
        final androidx.appcompat.app.b create = title.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: u4.c
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                d dVar = d.this;
                androidx.appcompat.app.b bVar3 = create;
                View view = inflate;
                String str = d.U0;
                Objects.requireNonNull(dVar);
                bVar3.d(-3).setOnClickListener(new x3.c(dVar, view, 5));
            }
        });
        return create;
    }

    public final int R0(String str, ArrayAdapter arrayAdapter) {
        int position = arrayAdapter.getPosition(str);
        if (position == -1) {
            position = 0;
        }
        return position;
    }

    public final void S0(View view) {
        Spinner spinner = (Spinner) view.findViewById(R.id.quality_spinner);
        this.I0 = spinner;
        if (this.T0) {
            spinner.setAdapter((SpinnerAdapter) this.N0);
            this.I0.setSelection(R0(this.S0.getQuality(), this.N0), false);
        } else {
            spinner.setAdapter((SpinnerAdapter) this.M0);
            this.I0.setSelection(R0(this.S0.getQuality(), this.M0), false);
        }
        this.I0.setOnItemSelectedListener(this.R0);
        Spinner spinner2 = (Spinner) view.findViewById(R.id.production_spinner);
        this.J0 = spinner2;
        spinner2.setAdapter((SpinnerAdapter) this.O0);
        Spinner spinner3 = this.J0;
        String production = this.S0.getProduction();
        ArrayAdapter<String> arrayAdapter = this.O0;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayAdapter.getCount()) {
                i10 = 0;
                break;
            } else if (arrayAdapter.getItem(i10).equalsIgnoreCase(production)) {
                break;
            } else {
                i10++;
            }
        }
        spinner3.setSelection(i10, false);
        this.J0.setOnItemSelectedListener(this.R0);
        Spinner spinner4 = (Spinner) view.findViewById(R.id.duration_spinner);
        this.K0 = spinner4;
        spinner4.setAdapter((SpinnerAdapter) this.P0);
        this.K0.setSelection(R0(this.S0.getDuration(), this.P0), false);
        this.K0.setOnItemSelectedListener(this.R0);
        this.L0 = (Spinner) view.findViewById(R.id.category_spinner);
        this.H0.add(this.E0.a().subscribe(new x2.a(this, 14)));
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        this.H0 = new CompositeDisposable();
        this.M0 = new ArrayAdapter<>(q(), (int) R.layout.spinner_video_filter_item, E().getStringArray(R.array.filter_quality));
        this.N0 = new ArrayAdapter<>(q(), (int) R.layout.spinner_video_filter_item, E().getStringArray(R.array.filter_quality_premium));
        this.O0 = new ArrayAdapter<>(q(), (int) R.layout.spinner_video_filter_item, E().getStringArray(R.array.filter_production));
        this.P0 = new ArrayAdapter<>(q(), (int) R.layout.spinner_video_filter_item, E().getStringArray(R.array.filter_duration));
        this.R0 = new b(null);
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.H0.clear();
    }
}
