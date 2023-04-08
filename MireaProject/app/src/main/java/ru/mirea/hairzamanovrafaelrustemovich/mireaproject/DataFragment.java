package ru.mirea.hairzamanovrafaelrustemovich.mireaproject;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DataFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DataFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DataFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DataFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DataFragment newInstance(String param1, String param2) {
        DataFragment fragment = new DataFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_data, container, false);

        CardView cardView = rootView.findViewById(R.id.card_view);
        cardView.setCardBackgroundColor(getResources().getColor(R.color
                .material_color_primary));

        int margin = getResources().getDimensionPixelSize(R.dimen.margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cardView
                .getLayoutParams();
        marginLayoutParams.setMargins(margin, margin, margin, margin);
        cardView.setLayoutParams(marginLayoutParams);

        TextView textView = rootView.findViewById(R.id.text_view);
        textView.setText("Веб-дизайн - это процесс создания веб-сайтов. Он включает в себя различные аспекты, такие как визуальный дизайн, пользовательский интерфейс, создание контента и оптимизацию для поисковых систем. Веб-дизайнеры используют различные инструменты, такие как графические редакторы и языки программирования, чтобы создать привлекательные и функциональные сайты для пользователей. Важными навыками для веб-дизайнеров являются знание HTML, CSS и JavaScript, а также умение работать с графическими программами и веб-фреймворками. Цветовая схема и компоновка элементов сайта также важны для создания хорошо выглядящего и удобного для использования интерфейса.");
        textView.setTextColor(getResources().getColor(R.color
                .material_color_on_primary));

        int padding = getResources().getDimensionPixelSize(R.dimen.padding);
        textView.setPadding(padding, padding, padding, padding);

        return rootView;
    }
}