const topics = [  
    //arrayHashing 
    [
        {title : 'Contains Duplicate', link : 'https://leetcode.com/problems/contains-duplicate/', level : 'Easy'},
        {title : 'Valid Anagram', link : 'https://leetcode.com/problems/valid-anagram/', level : 'Easy'},
        {title : 'Two Sum', link : 'https://leetcode.com/problems/two-sum/', level : 'Easy'},
        {title : 'Group Anagrams', link : 'https://leetcode.com/problems/group-anagrams/', level : 'Medium'},
        {title : 'Top K Frequent Elements', link : 'https://leetcode.com/problems/top-k-frequent-elements/', level : 'Medium'},
        {title : 'Product of Array Except Self', link : 'https://leetcode.com/problems/product-of-array-except-self/', level : 'Medium'},
        {title : 'Valid Sudoku', link : 'https://leetcode.com/problems/valid-sudoku/', level : 'Medium'},
        {title : 'Encode and Decode Strings', link : 'https://www.lintcode.com/problem/659/', level : 'Medium'},
        {title : 'Longest Consecutive Sequence', link : 'https://leetcode.com/problems/longest-consecutive-sequence/', level : 'Medium'}
    ],

    //twoPointers 
    [
        {title : 'Valid Palindrome', link : 'https://leetcode.com/problems/valid-palindrome/', level : 'Easy'},
        {title : 'Two Sum II Input Array Is Sorted', link : 'https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/', level : 'Medium'},
        {title : '3Sum', link : 'https://leetcode.com/problems/3sum/', level : 'Medium'},
        {title : 'Container With Most Water', link : 'https://leetcode.com/problems/container-with-most-water/', level : 'Medium'},
        {title : 'Trapping Rain Water', link : 'https://leetcode.com/problems/trapping-rain-water/', level : 'Hard'},
    ],

    //slidingWindow 
    [
        {title : 'Best Time to Buy And Sell Stock', link : 'https://leetcode.com/problems/best-time-to-buy-and-sell-stock/', level : 'Easy'},
        {title : 'Longest Substring Without Repeating Characters', link : 'https://leetcode.com/problems/longest-substring-without-repeating-characters/', level : 'Medium'},
        {title : 'Longest Repeating Character Replacement', link : 'https://leetcode.com/problems/longest-repeating-character-replacement/', level : 'Medium'},
        {title : 'Permutation In String', link : 'https://leetcode.com/problems/permutation-in-string/', level : 'Medium'},
        {title : 'Minimum Window Substring', link : 'https://leetcode.com/problems/minimum-window-substring/', level : 'Hard'},
        {title : 'Sliding Window Maximum', link : 'https://leetcode.com/problems/sliding-window-maximum/', level : 'Hard'}
    ],

    //stack 
    [
        {title : 'Valid Parentheses', link : 'https://leetcode.com/problems/valid-parentheses/', level : 'Easy'},
        {title : 'Min Stack', link : 'https://leetcode.com/problems/min-stack/', level : 'Medium'},
        {title : 'Evaluate Reverse Polish Notation', link : 'https://leetcode.com/problems/evaluate-reverse-polish-notation/', level : 'Medium'},
        {title : 'Generate Parentheses', link : 'https://leetcode.com/problems/generate-parentheses/', level : 'Medium'},
        {title : 'Daily Temperatures', link : 'https://leetcode.com/problems/daily-temperatures/', level : 'Medium'},
        {title : 'Car Fleet', link : 'https://leetcode.com/problems/car-fleet/', level : 'Medium'},
        {title : 'Largest Rectangle in Histogram', link : 'https://leetcode.com/problems/largest-rectangle-in-histogram/', level : 'Hard'}
    ],

    //binarySearch 
    [
        {title : 'Binary Search', link : 'https://leetcode.com/problems/binary-search/', level : 'Easy'},
        {title : 'Search a 2D Matrix', link : 'https://leetcode.com/problems/search-a-2d-matrix/', level : 'Medium'},
        {title : 'Koko Eating Bananas', link : 'https://leetcode.com/problems/koko-eating-bananas/', level : 'Medium'},
        {title : 'Find Minimum In Rotated Sorted Array', link : 'https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/', level : 'Medium'},
        {title : 'Search In Rotated Sorted Array', link : 'https://leetcode.com/problems/search-in-rotated-sorted-array/', level : 'Medium'},
        {title : 'Time Based Key Value Store', link : 'https://leetcode.com/problems/time-based-key-value-store/', level : 'Medium'},
        {title : 'Median of Two Sorted Arrays', link : 'https://leetcode.com/problems/median-of-two-sorted-arrays/', level : 'Hard'}
    ],

    //linkedList 
    [
        {title : 'Reverse Linked List', link : 'https://leetcode.com/problems/reverse-linked-list/', level : 'Easy'},
        {title : 'Merge Two Sorted Lists', link : 'https://leetcode.com/problems/merge-two-sorted-lists/', level : 'Easy'},
        {title : 'Reorder List', link : 'https://leetcode.com/problems/reorder-list/', level : 'Medium'},
        {title : 'Remove Nth Node From End of List', link : 'https://leetcode.com/problems/remove-nth-node-from-end-of-list/', level : 'Medium'},
        {title : 'Copy List With Random Pointer', link : 'https://leetcode.com/problems/copy-list-with-random-pointer/', level : 'Medium'},
        {title : 'Add Two Numbers', link : 'https://leetcode.com/problems/add-two-numbers/', level : 'Medium'},
        {title : 'Linked List Cycle', link : 'https://leetcode.com/problems/linked-list-cycle/', level : 'Easy'},
        {title : 'Find The Duplicate Number', link : 'https://leetcode.com/problems/find-the-duplicate-number/', level : 'Easy'},
        {title : 'LRU cache', link : 'https://leetcode.com/problems/lru-cache/', level : 'Medium'},
        {title : 'Merge k Sorted Lists', link : 'https://leetcode.com/problems/merge-k-sorted-lists/', level : 'Hard'},
        {title : 'Reverse Nodes in k-Group', link : 'https://leetcode.com/problems/reverse-nodes-in-k-group/', level : 'Hard'},
    ],

    //trees 
    [
        {title : 'Invert Binary Tree', link : 'https://leetcode.com/problems/reverse-linked-list/', level : 'Easy'},
        {title : 'Maximum Depth of Binary', link : 'https://leetcode.com/problems/maximum-depth-of-binary-tree/', level : 'Easy'},
        {title : 'Diameter of Binary Tree', link : 'https://leetcode.com/problems/diameter-of-binary-tree/', level : 'Easy'},
        {title : 'Balanced Binary Tree', link : 'https://leetcode.com/problems/balanced-binary-tree/', level : 'Easy'},
        {title : 'Same Tree', link : 'https://leetcode.com/problems/same-tree/', level : 'Easy'},
        {title : 'Subtree of Another Tree', link : 'https://leetcode.com/problems/subtree-of-another-tree/', level : 'Easy'},
        {title : 'Lowest Common Ancestor of a Binary Search Tree', link : 'https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/', level : 'Medium'},
        {title : 'Binary Tree Level Order Traversal', link : 'https://leetcode.com/problems/binary-tree-level-order-traversal/', level : 'Medium'},
        {title : 'Binary Tree Right Side View', link : 'https://leetcode.com/problems/binary-tree-right-side-view/', level : 'Medium'},   
        {title : 'Count Good Nodes In Binary Tree', link : 'https://leetcode.com/problems/count-good-nodes-in-binary-tree/', level : 'Medium'},   
        {title : 'Validate Binary Search Tree', link : 'https://leetcode.com/problems/validate-binary-search-tree/', level : 'Medium'},   
        {title : 'Kth Smallest Element In a Bst', link : ' https://leetcode.com/problems/kth-smallest-element-in-a-bst/', level : 'Medium'},   
        {title : 'Construct Binary Tree From Preorder And Inorder Traversal', link : 'https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/', level : 'Medium'},   
        {title : 'Binary Tree Maximum Path Sum', link : 'https://leetcode.com/problems/binary-tree-maximum-path-sum/', level : 'Hard'},   
        {title : 'Serialize And Deserialize Binary Tree', link : 'https://leetcode.com/problems/serialize-and-deserialize-binary-tree/', level : 'Hard'},   
    ],

    //tries 
    [
        {title : 'Implement Trie Prefix Tree', link : 'https://leetcode.com/problems/implement-trie-prefix-tree/', level : 'Medium'},
        {title : 'Design Add and Search Words Data Structure', link : 'https://leetcode.com/problems/design-add-and-search-words-data-structure/', level : 'Medium'},
        {title : 'Word Search II', link : 'https://leetcode.com/problems/word-search-ii/', level : 'Hard'},
    ],

    //heap 
    [
        {title : 'Kth Largest Element in a Stream', link : 'https://leetcode.com/problems/kth-largest-element-in-a-stream/', level : 'Easy'},
        {title : 'Last Stone Weight', link : 'https://leetcode.com/problems/last-stone-weight/', level : 'Easy'},
        {title : 'K Closest Points to Origin', link : 'https://leetcode.com/problems/k-closest-points-to-origin/', level : 'Medium'},
        {title : 'Task Scheduler', link : 'https://leetcode.com/problems/task-scheduler/', level : 'Medium'},
        {title : 'Design Twitter', link : 'https://leetcode.com/problems/design-twitter/', level : 'Medium'},
        {title : 'Find Median From Data Stream', link : 'https://leetcode.com/problems/find-median-from-data-stream/', level : 'Hard'}
    ],

    //backtracking 
    [
        {title : 'Subsets', link : 'https://leetcode.com/problems/subsets/', level : 'Medium'},
        {title : 'Combination Sum', link : 'https://leetcode.com/problems/combination-sum/', level : 'Medium'},
        {title : 'Permutations', link : 'https://leetcode.com/problems/permutations/', level : 'Medium'},
        {title : 'Subset II', link : 'https://leetcode.com/problems/subsets-ii/', level : 'Medium'},
        {title : 'Combination Sum II', link : 'https://leetcode.com/problems/combination-sum-ii/', level : 'Medium'},
        {title : 'Word Search', link : 'https://leetcode.com/problems/word-search/', level : 'Medium'},
        {title : 'Palindrome Partitioning', link : 'https://leetcode.com/problems/palindrome-partitioning/', level : 'Medium'},
        {title : 'Letter Combinations of a Phone Number', link : 'https://leetcode.com/problems/letter-combinations-of-a-phone-number/', level : 'Medium'},
        {title : 'N Queens', link : 'https://leetcode.com/problems/n-queens/', level : 'Hard'}
    ],

    //graph 
    [
        {title : 'Number of Islands', link : 'https://leetcode.com/problems/number-of-islands/', level : 'Medium'},
        {title : 'Clone Graph', link : 'https://leetcode.com/problems/clone-graph/', level : 'Medium'},
        {title : 'Max Area of Island', link : 'https://leetcode.com/problems/max-area-of-island/', level : 'Medium'},
        {title : 'Pacific Atlantic Water Flow', link : 'https://leetcode.com/problems/pacific-atlantic-water-flow/', level : 'Medium'},
        {title : 'Surrounded Regions', link : 'https://leetcode.com/problems/surrounded-regions/', level : 'Medium'},
        {title : 'Rotting Oranges', link : 'https://leetcode.com/problems/rotting-oranges/', level : 'Medium'},
        {title : 'Walls And Gates', link : 'https://www.lintcode.com/problem/663/', level : 'Medium'},
        {title : 'Course Schedule', link : 'https://leetcode.com/problems/course-schedule/', level : 'Medium'},
        {title : 'Course Schedule II', link : 'https://leetcode.com/problems/course-schedule-ii/', level : 'Medium'},
        {title : 'Redundant Connection', link : 'https://leetcode.com/problems/redundant-connection/', level : 'Medium'},
        {title : 'Number of Connected Components In An Undirected Graph', link : 'https://www.lintcode.com/problem/591/', level : 'Medium'},
        {title : 'Graph Valid Tree', link : 'https://www.lintcode.com/problem/178/', level : 'Medium'},
        {title : 'Word Ladder', link : 'https://leetcode.com/problems/word-ladder/', level : 'Hard'},
        {title : 'Reconstruct Itinerary', link : 'https://leetcode.com/problems/reconstruct-itinerary/', level : 'Hard'},
        {title : 'Min Cost to Connect All Points', link : 'https://leetcode.com/problems/min-cost-to-connect-all-points/', level : 'Medium'},
        {title : 'Network Delay Time', link : 'https://leetcode.com/problems/network-delay-time/', level : 'Medium'},
        {title : 'Swim In Rising Water', link : 'https://leetcode.com/problems/swim-in-rising-water/', level : 'Hard'},
        {title : 'Alien Dictionary', link : 'https://www.lintcode.com/problem/892/', level : 'Hard'},
        {title : 'Cheapest Flights Within K Stops', link : 'https://leetcode.com/problems/cheapest-flights-within-k-stops/', level : 'Medium'}
    ],

    //dp 
    [
        {title : 'Climbing Stairs', link : 'https://leetcode.com/problems/climbing-stairs/', level : 'Easy'},
        {title : 'Min Cost Climbing Stairs', link : 'https://leetcode.com/problems/min-cost-climbing-stairs/', level : 'Easy'},
        {title : 'House Robber', link : 'https://leetcode.com/problems/house-robber/', level : 'Medium'},
        {title : 'House Robber II', link : 'https://leetcode.com/problems/house-robber-ii/', level : 'Medium'},
        {title : 'Longest Palindromic Substring', link : 'https://leetcode.com/problems/longest-palindromic-substring/', level : 'Medium'},
        {title : 'Palindromic Substrings', link : 'https://leetcode.com/problems/palindromic-substrings/', level : 'Medium'},
        {title : 'Decode Ways', link : 'https://leetcode.com/problems/decode-ways/', level : 'Medium'},
        {title : 'Coin Change', link : 'https://leetcode.com/problems/coin-change/', level : 'Medium'},
        {title : 'Maximum Product Subarray', link : 'https://leetcode.com/problems/maximum-product-subarray/', level : 'Medium'},
        {title : 'Word Break', link : 'https://leetcode.com/problems/word-break/', level : 'Medium'},
        {title : 'Longest Increasing Subsequence', link : 'https://leetcode.com/problems/longest-increasing-subsequence/', level : 'Medium'},
        {title : 'Partition Equal Subset Sum', link : 'https://leetcode.com/problems/partition-equal-subset-sum/', level : 'Medium'},
        {title : 'Unique Paths', link : 'https://leetcode.com/problems/unique-paths/', level : 'Medium'},
        {title : 'Longest Common Subsequence', link : 'https://leetcode.com/problems/longest-common-subsequence/', level : 'Medium'},
        {title : 'Best Time to Buy And Sell Stock With Cooldown', link : 'https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/', level : 'Medium'},
        {title : 'Coin Change II', link : 'https://leetcode.com/problems/coin-change-ii/', level : 'Medium'},
        {title : 'Target Sum', link : 'https://leetcode.com/problems/target-sum/', level : 'Medium'},
        {title : 'Interleaving String', link : 'https://leetcode.com/problems/interleaving-string/', level : 'Medium'},
        {title : 'Longest Increasing Path In a Matrix', link : 'https://leetcode.com/problems/longest-increasing-path-in-a-matrix/', level : 'Hard'},
        {title : 'Distinct Subsequences', link : 'https://leetcode.com/problems/distinct-subsequences/', level : 'Hard'},
        {title : 'Edit Distance', link : 'https://leetcode.com/problems/edit-distance/', level : 'Hard'},
        {title : 'Burst Balloons', link : 'https://leetcode.com/problems/burst-balloons/', level : 'Hard'},
        {title : 'Regular Expression Matching', link : 'https://leetcode.com/problems/regular-expression-matching/', level : 'Hard'}
    ],

    //greedy 
    [
        {title : 'Maximum Subarray', link : 'https://leetcode.com/problems/maximum-subarray/', level : 'Medium'},
        {title : 'Jump Game', link : 'https://leetcode.com/problems/jump-game/', level : 'Medium'},
        {title : 'Jump Game II', link : 'https://leetcode.com/problems/jump-game-ii/', level : 'Medium'},
        {title : 'Gas Station', link : 'https://leetcode.com/problems/gas-station/', level : 'Medium'},
        {title : 'Hand of Straights', link : 'https://leetcode.com/problems/hand-of-straights/', level : 'Medium'},
        {title : 'Merge Triplets to Form Target Triplet', link : 'https://leetcode.com/problems/merge-triplets-to-form-target-triplet/', level : 'Medium'},
        {title : 'Partition Labels', link : 'https://leetcode.com/problems/partition-labels/', level : 'Medium'},
        {title : 'Valid Parenthesis String', link : 'https://leetcode.com/problems/valid-parenthesis-string/', level : 'Medium'}
    ],

    //intervals 
    [
        {title : 'Insert Interval', link : 'https://leetcode.com/problems/insert-interval/', level : 'Medium'},
        {title : 'Merge Intervals', link : 'https://leetcode.com/problems/merge-intervals/', level : 'Medium'},
        {title : 'Non Overlapping Intervals', link : 'https://leetcode.com/problems/non-overlapping-intervals/', level : 'Medium'},
        {title : 'Meeting Rooms', link : 'https://www.lintcode.com/problem/920/', level : 'Easy'},
        {title : 'Meeting Rooms II', link : 'https://www.lintcode.com/problem/919/', level : 'Medium'},
        {title : 'Minimum Interval to Include Each Query', link : 'https://leetcode.com/problems/minimum-interval-to-include-each-query/', level : 'Hard'},
    ],

    //mathGeomatry 
    [
        {title : 'Rotate Image', link : 'https://leetcode.com/problems/rotate-image/', level : 'Medium'},
        {title : 'Spiral Matrix', link : 'https://leetcode.com/problems/spiral-matrix/', level : 'Medium'},
        {title : 'Set Matrix Zeroes', link : 'https://leetcode.com/problems/set-matrix-zeroes/', level : 'Medium'},
        {title : 'Happy Number', link : 'https://leetcode.com/problems/happy-number/', level : 'Easy'},
        {title : 'Plus One', link : 'https://leetcode.com/problems/plus-one/', level : 'Easy'},
        {title : 'Pow(x, n)', link : 'https://leetcode.com/problems/powx-n/', level : 'Medium'},
        {title : 'Multiply Strings', link : 'https://leetcode.com/problems/multiply-strings/', level : 'Medium'},
        {title : 'Detect Squares', link : 'https://leetcode.com/problems/detect-squares/', level : 'Medium'}
    ],

    //bitManipulation 
    [
        {title : 'Single Number', link : 'https://leetcode.com/problems/single-number/', level : 'Easy'},
        {title : 'Number of 1 Bits', link : 'https://leetcode.com/problems/number-of-1-bits/', level : 'Easy'},
        {title : 'Counting Bits', link : 'https://leetcode.com/problems/counting-bits/', level : 'Easy'},
        {title : 'Reverse Bits', link : 'https://leetcode.com/problems/reverse-bits/', level : 'Easy'},
        {title : 'Missing Number', link : 'https://leetcode.com/problems/missing-number/', level : 'Easy'},
        {title : 'Sum of Two Integers', link : 'https://leetcode.com/problems/sum-of-two-integers/', level : 'Medium'},
        {title : 'Reverse Integer', link : 'https://leetcode.com/problems/reverse-integer/', level : 'Medium'}
    ]   
];

const quotes =
["Inspiration does exist, but it must find you working.",,
"Don't settle for average. Bring your best to the moment. Then, whether it fails or succeeds, at least you know you gave all you had.",
"Show up, show up, show up, and after a while the muse shows up, too.",
"Don't bunt. Aim out of the ballpark. Aim for the company of immortals.",
"I have stood on a mountain of no’s for one yes.",
"The best way out is always through.",
"If there is no struggle, there is no progress.",
"Courage is like a muscle. We strengthen it by use.",
"Keep a little fire burning; however small, however hidden.",
"I never look back, darling. It distracts from the now",
"A year from now you will wish you had started today",
"Somewhere, something incredible is waiting to be known.",
"Don’t worry about failure; you only have to be right once.",
"Never let success get to your head and never let failure get to your heart.",
"The most difficult thing is the decision to act, the rest is merely tenacity.",
"I will not lose, for even in defeat, there’s a valuable lesson learned, so it evens up for me.",
"I do not try to be better than anyone else. I only try to be better than myself.",
"If you don’t risk anything, you risk even more.",
"No one changes the world who isn’t obsessed."
];


function getQuestions() {
    const startDate = new Date('05/23/2023');
    const currDate = new Date(`${new Date().toLocaleDateString()}`);

    let daysDifference = (currDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24);
    const questionList = document.querySelector('.questions');
    
    topics.forEach(topic => {
        
        let questionNum = daysDifference % topic.length;
        const question = document.createElement('li');
        question.className = 'question';

        question.innerHTML = `<a href="${topic[questionNum].link}" target = "_blank">${topic[questionNum].title}</a> `;
        const questionLvl = document.createElement('button');
        questionLvl.innerText = `${topic[questionNum].level}`; 
        questionLvl.className = `${topic[questionNum].level}`.toLowerCase();
        question.appendChild(questionLvl);

        questionList.appendChild(question);
    });

    let random = getRandom(quotes.length);
    document.querySelector('.quote').innerText = `${quotes[random]}`;
}

function getRandom (num) {
    return Math.round(Math.random() * num) + 1; 
} 

getQuestions();