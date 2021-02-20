package pages;

import com.microsoft.playwright.Page;

import java.util.List;
import java.util.stream.Collectors;

import static com.microsoft.playwright.Page.WaitForSelectorOptions.State.ATTACHED;
import static com.microsoft.playwright.Page.WaitForSelectorOptions.State.DETACHED;

public class SearchPage {

    private Page page;

    public SearchPage(Page page) {
        this.page = page;
    }
}