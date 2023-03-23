package algonquin.cst2335.jianglianlab8.data;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import algonquin.cst2335.jianglianlab8.ChatMessage;

public class ChatViewModel extends ViewModel {
    public MutableLiveData<ArrayList<ChatMessage>> messages = new MutableLiveData<>();
    public MutableLiveData<ChatMessage> selectedMessage = new MutableLiveData< >();
}