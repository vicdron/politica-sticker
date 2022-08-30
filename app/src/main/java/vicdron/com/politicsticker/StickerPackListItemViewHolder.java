package vicdron.com.politicsticker;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdView;

class StickerPackListItemViewHolder extends RecyclerView.ViewHolder {

    final View container;
    final TextView titleView;
    final TextView publisherView;
    final TextView filesizeView;
    final ImageView addButton;
    final ImageView animatedStickerPackIndicator;
    final LinearLayout imageRowView;


    StickerPackListItemViewHolder(final View itemView) {
        super(itemView);
        container = itemView;
        titleView = itemView.findViewById(R.id.sticker_pack_title);
        publisherView = itemView.findViewById(R.id.sticker_pack_publisher);
        filesizeView = itemView.findViewById(R.id.sticker_pack_filesize);
        addButton = itemView.findViewById(R.id.add_button_on_list);
        imageRowView = itemView.findViewById(R.id.sticker_packs_list_item_image_list);
        animatedStickerPackIndicator = itemView.findViewById(R.id.sticker_pack_animation_indicator);
    }
}