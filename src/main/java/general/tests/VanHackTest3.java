package general.tests;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.IntStream;

class Result3 {

    /*
     * Complete the 'countMeetings' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY firstDay
     *  2. INTEGER_ARRAY lastDay
     */
    public static List<Integer> kthPerson(int k, List<Integer> p, List<Integer> q) {
    
    	return Collections.emptyList();
    }

}

public class VanHackTest3 {
    public static void teste() throws IOException {
//        List<Integer> firstDay = Arrays.asList(40921, 45173, 76498, 25644, 84272, 14545, 2833, 74232, 25898, 62928, 31612, 84295, 19357, 4878, 30613, 44909, 540, 18465, 16435, 45721, 367, 18848, 75108, 24246, 71140, 41259, 22299, 98836, 61473, 10776, 86757, 82377, 93964, 38569, 45356, 2677, 37365, 15556, 20060, 88710, 16380, 43588, 14979, 28990, 5855, 57005, 96908, 80873, 26334, 65556, 40365, 82925, 91114, 29552, 93143, 14070, 74644, 27861, 76709, 97233, 97599, 6876, 71321, 56674, 2715, 581, 64558, 464, 22556, 74321, 67468, 51506, 359, 13934, 39974, 92452, 82022, 67312, 91738, 32739, 11332, 34965, 58514, 65327, 18335, 84045, 6700, 36942, 30980, 28599, 4177, 54091, 32747, 790, 25729, 24707, 42126, 19740, 10570, 94781, 14694, 9420, 74277, 30384, 5248, 52730, 74388, 23345, 66361, 66675, 83497, 48157, 31208, 65870, 11777, 4248, 42668, 85, 48660, 52841, 72818, 13250, 10122, 78090, 24785, 1558, 53036, 23101, 54299, 71550, 16809, 46902, 90699, 3521, 93489, 87317, 19709, 9057, 51969, 89021, 79394, 30422, 80937, 20778, 87708, 47244, 60210, 73141, 67730, 79962, 65558, 48279, 5953, 68680, 93832, 41580, 42164, 17500, 57867, 74765, 58559, 13156, 73018, 62348, 85890, 91123, 15311, 98046, 88288, 77975, 53074, 3775, 78114, 46219, 51648, 11727, 11270, 38399, 4535, 64349, 12718, 82607, 66676, 83866, 27531, 74229, 7464, 76643, 9511, 78251, 12628, 91300, 34930, 94082, 39407, 9179, 35866, 6275, 3107, 61086, 70422, 9027, 94289, 59357, 44849, 6514, 37685, 46142, 74584, 83822, 40279, 89219, 74946, 53633, 87401, 494, 18969, 26354, 75926, 32360, 62643, 1716, 17253, 58568, 6538, 75478, 56887, 30091, 41452, 15551, 10420, 74097, 23156, 31374, 25252, 14537, 81722, 48527, 71170, 51620, 25815, 49755, 51684, 5362, 34545, 48433, 39421, 50704, 7170, 53704, 90629, 12442, 55165, 97159, 81274, 71885, 35473, 74544, 78533, 16285, 70752, 48288, 20282, 81978, 69705, 18182, 71350, 17825, 16209, 56792, 38736, 53264, 43700, 70060, 75500, 25219, 72419, 54265, 17257, 22279, 91069, 58772, 63288, 62368, 79897, 72147, 41597, 52401, 92922, 98104, 27186, 50250, 93219, 18251, 65842, 16041, 95747, 3756, 91810, 87867, 20900, 60807, 17281, 48604, 38386, 29744, 32873, 15218, 6934, 64927, 99416, 14177, 24526, 97760, 26331, 25787, 55037, 14675, 35994, 29415, 90761, 53252, 22932, 68639, 87873, 48970, 83693, 73794, 94440, 88108, 15889, 45040, 75680, 85629, 51040, 25629, 42617, 68987, 47063, 48917, 73570, 48714, 83904, 43736, 87052, 40492, 71535, 97218, 48148, 91018, 49354, 66170, 86200, 83603, 52231, 43669, 10709, 58577, 19359, 33206, 69070, 45500, 67508, 94251, 39490, 71216, 36069, 69556, 70132, 86426, 79876, 24468, 97590, 60335, 99272, 87007, 59028, 44726, 31912, 58249, 83351, 32832, 67560, 63073, 10649, 31998, 91798, 56602, 23582, 89760, 65097, 53758, 89051, 22827, 68009, 90333, 79089, 91166, 48418, 65077, 1916, 1627, 14796, 40182, 2742, 33597, 77955, 72417, 84089, 28708, 72667, 44480, 28630, 41262, 87124, 71479, 65379, 52797, 73516, 99914, 13519, 18372, 78768, 68958, 33207, 35966, 56722, 1638, 57181, 97967, 33574, 68977, 50254, 14228, 2406, 17141, 54509, 56422, 15143, 74506, 29956, 52865, 16902, 14384, 33338, 95090, 34039, 64232, 54816, 43229, 46986, 42168, 2697, 71262, 14524, 93272, 75353, 27765, 37202, 47659, 12188, 17982, 69695, 9701, 90843, 1510, 53548, 88846, 63713, 19615, 73434, 60765, 96019, 76440, 64783, 47743, 39674, 25037, 98360, 49521, 31300, 45784, 189, 97671, 10973, 88993, 51429, 22158, 55723, 14800, 89966, 86754, 1140, 10892, 26661, 75339, 3600, 93852, 22135, 35236, 74742, 43880, 15063, 21095, 1941, 74874, 14088, 40484, 90639, 72882, 26904, 92321, 43171, 55678, 8498, 40164, 79044, 12090, 33739, 30755, 31180, 89182, 42929, 59652, 50897, 53759, 72355, 86574, 40760, 33632, 52758, 53337, 94001, 76998, 65580, 96366, 47553, 79779, 84462, 25403, 19878, 45358, 10421, 8657, 275, 90128, 1998, 50444, 68004, 29439, 70898, 75686, 14371, 53838, 8729, 67949, 70177, 94848, 82135, 37709, 70710, 67387, 76163, 20185, 23378, 8896, 9771, 35718, 47645, 78740, 57708, 28752, 12749, 37958, 96294, 67228, 64478, 50644, 85632, 82192, 50970, 62825, 93237, 40377, 22150, 6135, 50838, 12057, 92743, 93277, 57526, 60792, 27849, 44267, 15373, 21077, 91088, 91413, 10275, 28941, 56851, 76264, 87476, 59495, 74546, 1507, 55273, 9340, 6239, 78835, 69300, 86855, 10995, 40725, 68431, 8252, 48588, 4799, 52511, 41246, 39905, 84336, 28422, 72861, 68618, 15245, 51011, 56347, 43357, 25318, 15904, 47214, 72367, 70719, 63726, 52516, 22453, 55666, 35892, 3022, 78355, 89772, 21890, 2085, 53768, 60572, 95489, 52373, 87370, 25683, 38281, 41444, 11533, 94148, 10203, 84436, 4453, 31144, 2959, 23372, 35371, 43762, 76904, 71708, 53199, 81925, 48139, 33083, 10658, 89642, 36166, 87159, 60833, 49983, 31685, 56336, 68636, 24586, 66219, 76838, 69413, 24546, 7232, 45755, 79115, 81219, 73672, 81976, 74080, 79605, 62267, 2433, 9733, 30494, 32275, 88083, 69932, 95109, 32858, 83104, 32045, 88416, 89078, 61902, 32939, 83709, 70645, 41124, 35968, 43416, 32832, 49014, 3854, 26093, 38862, 45178, 16798, 32978, 55144, 70594, 68450, 6282, 47613, 28617, 90891, 27389, 58864, 2489, 56239, 65302, 51443, 2661, 93177, 60965, 2408, 39463, 49641, 75237, 11581, 61825, 81857, 69149, 81526, 67671, 54984, 2079, 19085, 39677, 87291, 8088, 49624, 19124, 86671, 88089, 12455, 16612, 30596, 24534, 26964, 35853, 33720, 86862, 72853, 80532, 38165, 63377, 82382, 61530, 7337, 19790, 80638, 99667, 97400, 41200, 67663, 18625, 65653, 1584, 2469, 41615, 20808, 74006, 54812, 62950, 76728, 75041, 62040, 21254, 77620, 10876, 52296, 80844, 67196, 91763, 10449, 6714, 91300, 14535, 48372, 955, 57684, 14158, 11539, 78049, 8581, 12466, 63540, 6499, 61492, 45613, 28100, 99910, 43482, 39329, 79377, 94703, 24784, 36252, 90302, 59576, 50440, 98262, 36842, 15912, 7041, 46919, 28458, 47203, 926, 69390, 50973, 19706, 89038, 25438, 15433, 74263, 30445, 39347, 14210, 34314, 36068, 12459, 85595, 7579, 49213, 46060, 71732, 80462, 85642, 23698, 15941, 61118, 3271, 85742, 66952, 95577, 81719, 11936, 68933, 87792, 29727, 94832, 81511, 71634, 67722, 27929, 25643, 80538, 83435, 81729, 31049, 76890, 73917, 40834, 20284, 76623, 19128, 47991, 28357, 10952, 42180, 18838, 36344, 15138, 11809, 56826, 58031, 93301, 48769, 30836, 41209, 46345, 13772, 42798, 53095, 93896, 13469, 38531, 90668, 83849, 80274, 46673, 49319, 79522, 4304, 18292, 92784, 87098, 70940, 42539, 12994, 91948, 40252, 52862, 70060, 16027, 56060, 79972, 20107, 36028, 74948, 20248, 67476, 86367, 80101, 85503, 5572, 93270, 41015, 54058, 33989, 1648, 50768, 71229, 72786, 25913, 54322, 25744, 67857, 23716, 37264, 27733, 32173, 49701, 68783, 55105, 66636, 38513, 2819, 38957, 62262, 6852, 63456, 56737, 79187, 23720, 3297, 84851, 29168, 44435, 82673, 74197, 75588, 47050, 38136, 74295, 84183, 67015, 66958, 96723, 14179, 33555, 67216, 75456, 96864, 55850, 26939, 16985, 68593, 60661, 91386, 38960, 64490, 74106, 26813, 17758, 21527, 46852, 82397, 89821, 95836, 22530, 26878, 48619, 13797, 98075, 61941, 15899, 42872, 69074, 70285, 22711, 50129, 20001, 57901, 42213, 17477, 33880, 68839, 7554, 8943, 31990, 42365, 97628, 55386, 71988, 11955, 53202, 36361, 6710, 28662, 53397, 47685, 87259, 52307, 19083, 98140, 1463, 23668, 31862, 4318, 20002, 80209, 93518, 88944, 72227, 93657, 50083, 76362, 80056, 90250, 59428, 60954, 63047, 74693, 25854, 45255, 25322, 56894, 63878, 36485, 31149, 60630, 44566, 76106, 56399, 25152, 85759, 26284, 24816, 15073, 53399, 95668, 76177, 23511, 38852, 31741, 86782, 97314, 15963, 84573, 55260, 89655, 67812, 79133, 62356, 98234, 20495, 80659, 9454, 16980, 49868, 24139, 41885, 22408, 64073, 77557, 71109, 14103, 41564, 22348, 20662, 14352, 66666, 15866, 81923, 91063, 46056, 51573, 88016, 80612, 47678, 17756, 3159, 66218, 18320, 86583, 18502, 45733, 75078, 70944, 35927, 64276, 96532, 720, 13188, 31189, 2556, 45290, 43537, 33829, 38944, 21581, 22016, 75057, 44223, 66898, 93393, 20099, 27367, 68119, 49332, 81632, 21524, 85047, 61522, 10150, 64805, 47962, 27589, 28467, 22997, 77888, 19421, 3040, 96347, 8817, 55719, 13661, 91491, 65130, 56355, 82598, 78795, 72644, 38365, 95443, 91131, 73698, 47746, 56243, 7483, 33665, 35052, 70024, 35287, 90350, 42571, 39898, 16749, 17178, 42489, 44580, 16100, 89907, 30869, 60604, 93707, 94217, 16089, 23329, 80978, 28356, 62944, 9542, 27908, 12518, 55436, 60042, 55636, 55085, 50519, 72766, 84508, 37147, 98296, 55225, 4487, 22408, 54877, 28147, 63012, 1447, 26329, 38923, 83538, 75481, 80740, 53903, 54215, 82855, 19454, 44506, 88694, 72120, 9539, 44395, 13900, 11286, 11060, 24739, 86746, 57418, 63714, 48222, 59952, 37613, 45000, 5438, 77753, 4837, 5739, 67378, 73664, 97691, 11100, 25137, 42906, 51239, 53823, 88480, 92324, 58904, 72029, 69996, 78021, 97681, 90198, 6904, 45634, 8904, 80473, 6283, 24744, 2204, 50946, 10622, 92715, 46507, 12134, 56948, 21475, 44923, 69837, 8710, 82898, 3012, 80810, 14601, 48941, 40472, 81598, 72067, 71981, 94295, 76554, 10149, 56092, 15011, 31780, 54887, 7984, 56088, 69610, 24466, 79415, 11191, 78447, 88020, 38647, 5930, 67173, 82819, 19519, 7689, 86482, 32549, 76964, 89271, 786, 23449, 22169, 2044, 56029, 23316, 63264, 81835, 71032, 20102, 73886, 52031, 31186, 28378, 15220, 19573, 57894, 31051, 11027, 71702, 52204, 19786, 81910, 45956, 55284, 7190, 57880, 87954, 81058, 86621, 29933, 25040, 46041, 59491, 11105, 78782, 45863, 32032, 42571, 73258, 19470, 87628, 18636, 42125, 59448, 22800, 54581, 1670, 44676, 63116, 44706, 26224, 48923, 25183, 85065, 18216, 47375, 93741, 17098, 19301, 58186, 56790, 51872, 67139, 98403, 8714, 89942, 56072, 34564, 73218, 74572, 96043, 80325, 61634, 15493, 2287, 12508, 7645, 31780, 77966, 16100, 51954, 77844, 96928, 50548, 69864, 17893, 77854, 64076, 92965, 62131, 16457, 25770, 20301, 17156, 97786, 83804, 13412, 67157, 41524, 23334, 4036, 796, 15675, 67740, 56595, 66714, 70846, 42647, 40540, 96783, 43302, 36821, 59045, 80880, 25611, 98117, 77837, 65653, 66674, 85759, 33889, 22075, 79141, 63013, 16284, 18866, 97040, 45904, 31142, 96335, 92851, 88571, 94762, 57137, 402, 46507, 11509, 48532, 31524, 891, 6452, 47649, 30657, 22997, 71138, 38539, 40820, 5627, 85932, 38014, 37875, 14537, 89801, 17030, 3850, 64873, 23699, 87259, 78786, 44899, 36475, 36427, 4045, 6928, 39849, 24952, 77704, 45648, 42778, 69074, 6877, 74214, 45982, 49913, 68664, 3509, 31644, 74598, 83472, 69065, 60095, 78103, 55943, 31240, 29552);
//        List<Integer> lastDay = Arrays.asList(63913, 80033, 96232, 58430, 87076, 98147, 18614, 78864, 83426, 93723, 33111, 98452, 54223, 77201, 54322, 92761, 78796, 33705, 20712, 90990, 61347, 98553, 98074, 93722, 89902, 66933, 64721, 99185, 63982, 11509, 97477, 84343, 98762, 91378, 52837, 49315, 50630, 95109, 98084, 94034, 36739, 49382, 23902, 75087, 58825, 77837, 97825, 88942, 67770, 96406, 84319, 84657, 97799, 41767, 99557, 45760, 89278, 68704, 99342, 98087, 99116, 42194, 91745, 88424, 7095, 34125, 74547, 48282, 25776, 80643, 91585, 55549, 15722, 36368, 51396, 99005, 84172, 78041, 93793, 71576, 61862, 48176, 63820, 97959, 50467, 93360, 89084, 88220, 98702, 44087, 6674, 93020, 38259, 43222, 36231, 88067, 61836, 49221, 93882, 99928, 73275, 9819, 93048, 62327, 63487, 99583, 91014, 49304, 85398, 77940, 94600, 48312, 63301, 67675, 72620, 70013, 97507, 15853, 65242, 56449, 76776, 30956, 68064, 83703, 27562, 58941, 67387, 94330, 90485, 75474, 23421, 70219, 93507, 43630, 97947, 99057, 25263, 9096, 75188, 93352, 80544, 82274, 83251, 47614, 89811, 55965, 83409, 81631, 88189, 83241, 66232, 90901, 10895, 89721, 95021, 56721, 69394, 44647, 97290, 86542, 73100, 70102, 91814, 83902, 96533, 92701, 26652, 99889, 90464, 82907, 61188, 47388, 79615, 73765, 71661, 90758, 30444, 81479, 61778, 98677, 55184, 96529, 93825, 97615, 78079, 80281, 72935, 80807, 97056, 83493, 85488, 92151, 83327, 97041, 69022, 84452, 76526, 29216, 27751, 61967, 81184, 72502, 97421, 70891, 54924, 72423, 69705, 61928, 92152, 85569, 89116, 90591, 98451, 54211, 99372, 3522, 73256, 69924, 93090, 62809, 64302, 70966, 67797, 90599, 64519, 99379, 96033, 87864, 50910, 54867, 62842, 97464, 83815, 67440, 83688, 55248, 84887, 86364, 87154, 57436, 80368, 81422, 92395, 79179, 67238, 85902, 48863, 65700, 53069, 65199, 98825, 12659, 72537, 99909, 81450, 84511, 53010, 94906, 99374, 88192, 81178, 89489, 68651, 82521, 92281, 41902, 71965, 39544, 70399, 58525, 88718, 69641, 57610, 91321, 90088, 79425, 73763, 74940, 42944, 89171, 99286, 90450, 91927, 70183, 95002, 84106, 57889, 90807, 96406, 99705, 54539, 60061, 95432, 89552, 96854, 98364, 99069, 66401, 98664, 93350, 70925, 62811, 40540, 93965, 63047, 82263, 77702, 78217, 56975, 81406, 99759, 25020, 90913, 98569, 85572, 64857, 59506, 26729, 36285, 33310, 93899, 59890, 23644, 76946, 99351, 77087, 94693, 92827, 95279, 93072, 77835, 83183, 83531, 92185, 90439, 56876, 62361, 80290, 57270, 85991, 88959, 53079, 96322, 97662, 90043, 52935, 97968, 99441, 63007, 99012, 65120, 94320, 90427, 92955, 65196, 85524, 95794, 99241, 74196, 63648, 89316, 70836, 96609, 95494, 87495, 91704, 84214, 87594, 76149, 92225, 92882, 82571, 97878, 81092, 99778, 87309, 92078, 89433, 78070, 66976, 84414, 69744, 96529, 82894, 83767, 52090, 97347, 91211, 81954, 94922, 67601, 90770, 89444, 51244, 99522, 92345, 93775, 92575, 96028, 73518, 26619, 72329, 54795, 70218, 92603, 79900, 99702, 89356, 94369, 77168, 85016, 58829, 72911, 53567, 94094, 85019, 69078, 93087, 84937, 99952, 34078, 97808, 91231, 70641, 73198, 47503, 95381, 26154, 68668, 98210, 40426, 73834, 96338, 90280, 58529, 36437, 73394, 73475, 31692, 76273, 44975, 88019, 97440, 90653, 53800, 99527, 41328, 77624, 81369, 61589, 78322, 60400, 93454, 79330, 79631, 94242, 89948, 81362, 56210, 90259, 47681, 67348, 72093, 43144, 96531, 91143, 76065, 97102, 89920, 29698, 88637, 85431, 99145, 87604, 88241, 94283, 87561, 33920, 99224, 75218, 84084, 79739, 90521, 98730, 90867, 95421, 94424, 44793, 90260, 92325, 98553, 92188, 32819, 45281, 67014, 80128, 22733, 99612, 60951, 47960, 84743, 71763, 94474, 21612, 55442, 85926, 86872, 99035, 95823, 91859, 36219, 96148, 58702, 77274, 91095, 46061, 82363, 86705, 93417, 98309, 70672, 90752, 50073, 76971, 88393, 66022, 94607, 89137, 42863, 91408, 99138, 90802, 96567, 83682, 91418, 98332, 87000, 82214, 91087, 98335, 62326, 78825, 93345, 69165, 92489, 96358, 44681, 77676, 79090, 45282, 96154, 94347, 67692, 62480, 98613, 70578, 95854, 95184, 96342, 61895, 86928, 95132, 87066, 70202, 56651, 72799, 88079, 88766, 55837, 88554, 75365, 76376, 29241, 80485, 99937, 90886, 94997, 78725, 94363, 89362, 81677, 81566, 95054, 55993, 70244, 87837, 52365, 36315, 97532, 93823, 77062, 98740, 56390, 66294, 51680, 87157, 95260, 96668, 43938, 51114, 79209, 97132, 88153, 68651, 84125, 53432, 82809, 46870, 45614, 86668, 71738, 92715, 83148, 83284, 84334, 96296, 53994, 50048, 72576, 74372, 87714, 94203, 41908, 87778, 93342, 68298, 66285, 84406, 72510, 72987, 32048, 93834, 94892, 76649, 74101, 57632, 91949, 87078, 76854, 84648, 98207, 99882, 23679, 83201, 71019, 98681, 98114, 56513, 88544, 75195, 64508, 62894, 66712, 96229, 67509, 91058, 10288, 96130, 93368, 87621, 59663, 84244, 90177, 82298, 70194, 82978, 50729, 95208, 96023, 97563, 52358, 87335, 93352, 93059, 74127, 87917, 76286, 78568, 85830, 90768, 89925, 26578, 14515, 48469, 87838, 89700, 82310, 86871, 85226, 93656, 99970, 12701, 44411, 57583, 43611, 98953, 91651, 98160, 63303, 93349, 76794, 99725, 93067, 77616, 33182, 92707, 91783, 82248, 63819, 43677, 40376, 78256, 36056, 61284, 62150, 82651, 30378, 64760, 72768, 75718, 88125, 22753, 88216, 78635, 94733, 48457, 79289, 32987, 93902, 91258, 60909, 48853, 96567, 76097, 57680, 82012, 94168, 85236, 70215, 92956, 94873, 84648, 87193, 80094, 92258, 36256, 60271, 71995, 93623, 46567, 81909, 53449, 92726, 95897, 47042, 26048, 50890, 48617, 58664, 47930, 93365, 90200, 98401, 96355, 47566, 81223, 89638, 75575, 67628, 21335, 91056, 99983, 99652, 45558, 94061, 30752, 74347, 15541, 96078, 54514, 32935, 79115, 64148, 63212, 86971, 87835, 86143, 47612, 96954, 47953, 99615, 92900, 83345, 93246, 14419, 56530, 96469, 85932, 63528, 12294, 88410, 39253, 37985, 90595, 36607, 88362, 77058, 58331, 73709, 90711, 83452, 99945, 77529, 40436, 87110, 98153, 79067, 43314, 91675, 67235, 84793, 98646, 60905, 94436, 24064, 85743, 41126, 61209, 37865, 93696, 88672, 26758, 90047, 68587, 51796, 99292, 56202, 40153, 95385, 61262, 58317, 64395, 97140, 83460, 64253, 67404, 83389, 89970, 88278, 44789, 32060, 76871, 52564, 91829, 72386, 98047, 97002, 31217, 78359, 96950, 52230, 99403, 83134, 88166, 85467, 76387, 85594, 96434, 90801, 84229, 96865, 83532, 94744, 65415, 75583, 90558, 19781, 92537, 72045, 47052, 48861, 41342, 56755, 89507, 24254, 60357, 97471, 94568, 77260, 95985, 70457, 66271, 73752, 84832, 87400, 96825, 51173, 67998, 93120, 90124, 91490, 87868, 65985, 92782, 88511, 88970, 96542, 92917, 98333, 71669, 32252, 92854, 65683, 56500, 83500, 74025, 89813, 82513, 21211, 72287, 80988, 83840, 82505, 98333, 86332, 95847, 57156, 94760, 84897, 97791, 84829, 3565, 75964, 91893, 80755, 50511, 91054, 92085, 92645, 42052, 78452, 87525, 94787, 82854, 83840, 95652, 96793, 90859, 84549, 60093, 78698, 13274, 76887, 59807, 96895, 56664, 79507, 90563, 30224, 83217, 83551, 86799, 82598, 64108, 88139, 86665, 96105, 67839, 89246, 99388, 41103, 75943, 87578, 82628, 97589, 74245, 99823, 67718, 99491, 89637, 98971, 91757, 69202, 88927, 64360, 28258, 46529, 51889, 89323, 90195, 96639, 75427, 86347, 93814, 26172, 98495, 83598, 70574, 78366, 79280, 84530, 97502, 85441, 45256, 78870, 76447, 56252, 87351, 93754, 62898, 11156, 42548, 48403, 98418, 70858, 88806, 91523, 87037, 79265, 13623, 90523, 66770, 71871, 88936, 63917, 23170, 99402, 92730, 74525, 43835, 16885, 41410, 80265, 99929, 93363, 97723, 97801, 59684, 92551, 95461, 90651, 72761, 81242, 64150, 90731, 55531, 92085, 32373, 82520, 95738, 97067, 46332, 63964, 63921, 88645, 56831, 96467, 98672, 27241, 63183, 46422, 87807, 97501, 88549, 88998, 50405, 90188, 88325, 98190, 27937, 99704, 77607, 92854, 85680, 97416, 91571, 98819, 97110, 97831, 31725, 48746, 80383, 77037, 43370, 96993, 79804, 88904, 84133, 53815, 47649, 88971, 77564, 96941, 69979, 29216, 95248, 93722, 65456, 67028, 94847, 81324, 86637, 36504, 52177, 74414, 59988, 95110, 87478, 78870, 87382, 75344, 97670, 73645, 99494, 72165, 73490, 35636, 49529, 93512, 63040, 39770, 79170, 94660, 98910, 90678, 46085, 95828, 96822, 75835, 96327, 96596, 99376, 88571, 23204, 95879, 71746, 67894, 79754, 93039, 61976, 41575, 99633, 97023, 71877, 38879, 97073, 61582, 76837, 17591, 95336, 95215, 93640, 82951, 88912, 81862, 90892, 99484, 95381, 82132, 82632, 66751, 34697, 48011, 46448, 92286, 60657, 96588, 74214, 87937, 18104, 52820, 94890, 81072, 34723, 90074, 57345, 71777, 93813, 96022, 25883, 68391, 87274, 97915, 87038, 85127, 48613, 95236, 80392, 75613, 61231, 64981, 79477, 84057, 90088, 84890, 98371, 80870, 81208, 27779, 96512, 85759, 83729, 89882, 51344, 78746, 93382, 85272, 96597, 90369, 69704, 89441, 94216, 96722, 90872, 98628, 98818, 46768, 54266, 99313, 98228, 33412, 93379, 81189, 88326, 82846, 74797, 82725, 96438, 52091, 81523, 95311, 60978, 79337, 92251, 98100, 39265, 70339, 85535, 68450, 62361, 98354, 94713, 84739, 85521, 97761, 84003, 99953, 90956, 66515, 55919, 47720, 84152, 44569, 65855, 28829, 91132, 72689, 99262, 55043, 53486, 60801, 22074, 45522, 79186, 17752, 84971, 61529, 88806, 31400, 91809, 52583, 97171, 74935, 89856, 95195, 80810, 70642, 88410, 53474, 33135, 66361, 91357, 81697, 80949, 27074, 82829, 91106, 96759, 95214, 80628, 42475, 93271, 93946, 99227, 10151, 87784, 39373, 84213, 92704, 4441, 69349, 89496, 58135, 89242, 49520, 97027, 95351, 95723, 49018, 94108, 81758, 60093, 76982, 83256, 72285, 62635, 44933, 79999, 96763, 99723, 40803, 94863, 49427, 88772, 12406, 72459, 98890, 83519, 95951, 44121, 54188, 67124, 71558, 95295, 81595, 99549, 78633, 90212, 86975, 26875, 97244, 27505, 87103, 80724, 99029, 87610, 30101, 91366, 78257, 61672, 88207, 59487, 36497, 99324, 45422, 96498, 94787, 81314, 90973, 87138, 56946, 91905, 89281, 99268, 20031, 91273, 59846, 54911, 75987, 96924, 97039, 99577, 87201, 61739, 14636, 49672, 58804, 99454, 81367, 73893, 93282, 98929, 99085, 52032, 78435, 58557, 95708, 71727, 98772, 71219, 28657, 38108, 33261, 34547, 99404, 97970, 78953, 90379, 42356, 74990, 66783, 9987, 23097, 87620, 85586, 89525, 92191, 92873, 48641, 97572, 66917, 61868, 96103, 83719, 65810, 99879, 90516, 80050, 70035, 90432, 64277, 70157, 90035, 80464, 85288, 37756, 98403, 97187, 34540, 97347, 93829, 89703, 97040, 94363, 26921, 89181, 59413, 58868, 52658, 24771, 30378, 86113, 71746, 86470, 71997, 43249, 48532, 31584, 97767, 61006, 80322, 16828, 93967, 20564, 27774, 93550, 49131, 89697, 80736, 84915, 47089, 39046, 88191, 65016);

        List<Integer> firstDay = Arrays.asList(1, 1,2);
        List<Integer> lastDay = Arrays.asList(1, 2, 2);
//        int result = Result3.countMeetings(firstDay, lastDay);
//        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();
    }
}