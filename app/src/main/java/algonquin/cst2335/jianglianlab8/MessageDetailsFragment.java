package algonquin.cst2335.jianglianlab8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import algonquin.cst2335.jianglianlab8.databinding.DetailsLayoutBinding;

public class MessageDetailsFragment extends Fragment{
    ChatMessage selected;
    DetailsLayoutBinding binding;
    public MessageDetailsFragment(ChatMessage m){
        selected =m;
    }

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        DetailsLayoutBinding binding = DetailsLayoutBinding.inflate(inflater);
        binding.message.setText(selected.message);
        binding.time.setText(selected.timeSent);
        binding.sentorreceive.setText(selected.isSentButton?"sent":"receive");
        binding.databaseid.setText("Id = " + selected.id);
        return binding.getRoot();
    }


    public void displayMessage(ChatMessage newMessageValue) {
    }
}
