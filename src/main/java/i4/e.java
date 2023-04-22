package i4;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.fragment.app.l;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.PhotosConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.photo.AlbumFilters;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.appsflyer.oaid.BuildConfig;
import e.p;
import f3.o;
import java.util.Objects;
import z2.cp;

/* loaded from: classes2.dex */
public class e extends l implements cp {
    public static String K0 = e.class.getSimpleName();
    public o D0;
    public p E0;
    public sc.c F0;
    public i3.a G0;
    public j H0;
    public ArrayAdapter<String> I0;
    public AlbumFilters J0;

    /* loaded from: classes2.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            e.this.J0.setTag(i10 == 0 ? BuildConfig.FLAVOR : e.this.I0.getItem(i10));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        UserOrientation orientation = this.D0.a().getOrientation();
        this.J0 = ((b3.j) this.E0.f8949c).i();
        this.H0 = new j(this.J0.getSegmentSelection());
        this.I0 = new ArrayAdapter<>(q(), (int) R.layout.spinner_video_filter_item, PhotosConfig.getAlbumTagsList(UsersConfig.isGay(orientation)));
        b.a title = new b.a(u0(), R.style.VideoFiltersDialogStyle).setTitle(I(R.string.segments));
        title.c(I(R.string.apply), new w3.c(this, 1));
        title.b(I(R.string.cancel), new DialogInterface.OnClickListener() { // from class: i4.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str = e.K0;
                dialogInterface.dismiss();
            }
        });
        i4.a aVar = new DialogInterface.OnClickListener() { // from class: i4.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str = e.K0;
            }
        };
        AlertController.b bVar = title.f496a;
        bVar.f485k = bVar.f476a.getText(R.string.clear);
        title.f496a.f486l = aVar;
        View inflate = View.inflate(new j.c(u0(), (int) R.style.ThemeFiltersDialogLight), R.layout.dialog_albums_segments, null);
        ((ListView) inflate.findViewById(R.id.listView)).setAdapter((ListAdapter) this.H0);
        title.setView(inflate);
        final Spinner spinner = (Spinner) inflate.findViewById(R.id.tagsSpinner);
        spinner.setAdapter((SpinnerAdapter) this.I0);
        int position = this.I0.getPosition(this.J0.getTag());
        if (position == -1) {
            position = 0;
        }
        spinner.setSelection(position, false);
        if (this.f2019u.getBoolean("search_mode")) {
            spinner.setEnabled(false);
            spinner.setAlpha(0.6f);
        } else {
            spinner.setOnItemSelectedListener(new a());
        }
        final androidx.appcompat.app.b create = title.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: i4.c
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                e eVar = e.this;
                androidx.appcompat.app.b bVar2 = create;
                Spinner spinner2 = spinner;
                String str = e.K0;
                Objects.requireNonNull(eVar);
                bVar2.d(-3).setOnClickListener(new d(eVar, spinner2, 0));
            }
        });
        return create;
    }
}
